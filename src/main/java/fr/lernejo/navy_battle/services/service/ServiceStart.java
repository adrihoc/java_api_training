package fr.lernejo.navy_battle.services.service;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import fr.lernejo.navy_battle.IController;
import fr.lernejo.navy_battle.services.IService;
import fr.lernejo.navy_battle.services.json_properties.StartJsonProperty;
import fr.lernejo.navy_battle.services.tools.DeserializationStartJsonProperty;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class ServiceStart implements IService {
    final IController controller;
    public ServiceStart(IController controller){
        this.controller = controller;
    }
    final public String BadRequestError = "error 400 : Bad request";
    @Override
    public void handler(final HttpExchange exchange) throws IOException {
        final String body;
        if (TestRequest(exchange)) {
            body = getBody(String.valueOf(exchange.getLocalAddress().getPort()));
            exchange.sendResponseHeaders(202, body.length());
        } else
        {
            body = getBody(String.valueOf(exchange.getLocalAddress().getPort()));
            exchange.sendResponseHeaders(400, body.length());
        }
        try (OutputStream os = exchange.getResponseBody()) { // (1)
                os.write(body.getBytes());
        }
        this.controller.getGame().SetTrueReadyTOShoot();
    }


    public String getBody(String port) throws UnknownHostException {
        final Gson gson = new Gson();
        final StartJsonProperty startJsonProperty = new StartJsonProperty(
            "2",
            "http://" + InetAddress.getLocalHost().getHostAddress() + ":" + port,
            "Bonjour");
        return gson.toJson(startJsonProperty);
    }


    public boolean TestRequest(final HttpExchange exchange){
        try{
            DeserializationStartJsonProperty deserialization= new DeserializationStartJsonProperty();
            StartJsonProperty request = deserialization.deserialization(exchange.getRequestBody());
            controller.getIClientManager().setAddress(request.url);
            return exchange.getRequestMethod().equals("POST");
        }
        catch (com.google.gson.JsonSyntaxException | IOException| NullPointerException e)
        {
            return false;
        }
    }
}
