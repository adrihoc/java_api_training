package fr.lernejo.navy_battle;
import fr.lernejo.server.HttpDaemon;

import java.io.IOException;

public class Launcher {
    public static void main(String[] args) throws IOException {
        int port;
        try {
            port = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid port format");
            return;
        }

        System.out.println("Starting the server!");
        HttpDaemon server = new HttpDaemon(port);
    }
}
