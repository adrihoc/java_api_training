package fr.lernejo.navy_battle.services.tools;

import java.io.IOException;
import java.io.InputStream;


public class ReadRequest {

    public String read(InputStream requestBody) throws IOException {
        final StringBuilder  body = new StringBuilder();
        for (final byte b : requestBody.readAllBytes()) {
            body.append((char) b);
        }
        System.out.println("receive : " + body.toString());
        return body.toString();
    }
}
