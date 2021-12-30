package fr.lernejo.navy_battle.services.json_properties;

import com.google.gson.annotations.Expose;

public class StartJsonProperty {
    public StartJsonProperty(final String id, final String url, final String message)
    {
        this.id = id;
        this.url = url;
        this.message = message;
    }
    @Expose(serialize = true, deserialize = true)
    public final String id;
    @Expose(serialize = true, deserialize = true)
    public final String url;
    @Expose(serialize = true, deserialize = true)
    public final String message;
}
