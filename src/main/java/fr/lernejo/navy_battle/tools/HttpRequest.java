package fr.lernejo.navy_battle.tools;
//import ...

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
	public Map<String, String> queryToMap(String query) {
	    Map<String, String> result = new HashMap<>();
	    try {
		    for (String param : query.split("&")) {
		        String[] entry = param.split("=");

                if (entry.length > 1) {
		            result.put(entry[0], entry[1]);
		        }
		    }
	    } catch (Exception e) {}

        return result;
	}
}
