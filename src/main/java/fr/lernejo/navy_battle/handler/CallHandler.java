package fr.lernejo.navy_battle.handler;
import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class CallHandler implements HttpHandler{
	@Override
	public void handle(HttpExchange exchange) throws IOException {
		 String body = "Navy battle server ready to use.";
		 exchange.sendResponseHeaders(150, body.length());

		 try (OutputStream os = exchange.getResponseBody()) {
		     os.write(body.getBytes());
		 }
	}
}
