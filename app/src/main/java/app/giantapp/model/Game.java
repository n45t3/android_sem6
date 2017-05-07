package app.giantapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WhoAmI on 07.05.2017.
 */

public class Game {
    private String id;
    private String name;
    private Image image;
    private String platforms;
    private String original_release_date;

    public Image getImage () { return image; }

    public void setImage (Image image)
    {
        this.image = image;
    }

    public String getPlatforms ()
    {
        return platforms;
    }

    public void setPlatforms (String platforms)
    {
        this.platforms = platforms;
    }

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

    public String getOriginal_release_date ()
    {
        return original_release_date;
    }

    public void setOriginal_release_date (String original_release_date)
    {
        this.original_release_date = original_release_date;
    }
}
