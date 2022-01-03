package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Server {
    HttpServer httpserver;
    Server(int port) throws IOException {
        httpserver = HttpServer.create(new InetSocketAddress(port), 0);
    }
}
