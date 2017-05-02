package app.giantapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Krystian on 2017-05-01.
 */

public class Platform
{
    public Platform(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }
}