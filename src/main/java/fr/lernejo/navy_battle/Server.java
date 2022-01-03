package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpServer;
import fr.lernejo.navy_battle.handler.CallHandler;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class Server {
    public void startServeur() throws IOException {
        HttpServer httpServer;
            httpServer = HttpServer.create(new InetSocketAddress(9867), 0);
            httpServer.setExecutor(newFixedThreadPool(1));
            httpServer.createContext("/ping", new CallHandler());
    }
}
