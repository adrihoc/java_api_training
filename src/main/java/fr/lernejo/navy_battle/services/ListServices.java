package fr.lernejo.navy_battle.services;

import fr.lernejo.navy_battle.IController;
import fr.lernejo.navy_battle.services.service.ServiceFire;
import fr.lernejo.navy_battle.services.service.ServicePing;
import fr.lernejo.navy_battle.services.service.ServiceStart;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;


public final class ListServices {
    final private Map<String, IService> listService;

    public ListServices(IController controller){
        this.listService = new HashMap<>();
        this.listService.put("/ping", new ServicePing());
        this.listService.put("/api/game/start", new ServiceStart(controller));
        this.listService.put("/api/game/fire", new ServiceFire(controller));
    }


    public Map<String, IService> getAllService(){
        return this.listService;
    }

}
