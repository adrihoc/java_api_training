package fr.lernejo.server;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;            //i         .//
// import everything

public class CallHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String response = "G'day all...'";
        String query = exchange.getRequestURI().getQuery();
        String requestMethod = exchange.getRequestMethod();

        exchange.sendResponseHeaders(100, response.length());

        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}
