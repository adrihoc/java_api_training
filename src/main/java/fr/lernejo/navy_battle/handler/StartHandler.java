package fr.lernejo.navy_battle.handler;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;

public class StartHandler implements HttpHandler{
	@Override
	public void handle(HttpExchange exchange) throws IOException {
		 String body = "";
		 exchange.sendResponseHeaders(404, body.length());
		 try (OutputStream os = exchange.getResponseBody()) {
		     os.write(body.getBytes());
		 }
	}
}
