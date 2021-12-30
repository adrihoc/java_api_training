package fr.lernejo.navy_battle.server;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;


public interface IServerNavyBattle  {


    public void startServer();


    public InetSocketAddress getAddress();
}
