package fr.lernejo.navy_battle.services;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;


public interface IService {

    public void handler(HttpExchange exchange) throws IOException;
}
