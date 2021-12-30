package fr.lernejo.navy_battle.clients;

import fr.lernejo.navy_battle.Controller;
import fr.lernejo.navy_battle.IController;
import fr.lernejo.navy_battle.clients.client.Client;
import fr.lernejo.navy_battle.clients.client.ClientFire;
import fr.lernejo.navy_battle.clients.client.ClientStart;

import java.util.HashMap;
import java.util.Map;

public class ListClients {
    final public Map<String, Client> clientList;
    public ListClients(IController controller){
        this.clientList = new HashMap<>();
        clientList.put("ClientFire", new ClientFire(controller));
        clientList.put("ClientStart", new ClientStart(controller));
    }
    public Map<String, Client> getClientList(){return this.clientList;}
}
