package app.giantapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Krystian on 2017-05-01.
 */

public class Image
{
    public Image(String medium_url, String screen_url, String super_url, String small_url, String thumb_url, String icon_url, String tiny_url) {
        this.medium_url = medium_url;
        this.screen_url = screen_url;
        this.super_url = super_url;
        this.small_url = small_url;
        this.thumb_url = thumb_url;
        this.icon_url = icon_url;
        this.tiny_url = tiny_url;
    }

    @SerializedName("medium_url")
    private String medium_url;

    @SerializedName("screen_url")
    private String screen_url;

    @SerializedName("super_url")
    private String super_url;

    @SerializedName("small_url")
    private String small_url;

    @SerializedName("thumb_url")
    private String thumb_url;

    @SerializedName("icon_url")
    private String icon_url;

    @SerializedName("tiny_url")
    private String tiny_url;

    public String getMedium_url ()
    {
        return medium_url;
    }

    public void setMedium_url (String medium_url)
    {
        this.medium_url = medium_url;
    }

    public String getScreen_url ()
    {
        return screen_url;
    }

    public void setScreen_url (String screen_url)
    {
        this.screen_url = screen_url;
    }

    public String getSuper_url ()
    {
        return super_url;
    }

    public void setSuper_url (String super_url)
    {
        this.super_url = super_url;
    }

    public String getSmall_url ()
    {
        return small_url;
    }

    public void setSmall_url (String small_url)
    {
        this.small_url = small_url;
    }

    public String getThumb_url ()
    {
        return thumb_url;
    }

    public void setThumb_url (String thumb_url)
    {
        this.thumb_url = thumb_url;
    }

    public String getIcon_url ()
    {
        return icon_url;
    }

    public void setIcon_url (String icon_url)
    {
        this.icon_url = icon_url;
    }

    public String getTiny_url ()
    {
        return tiny_url;
    }

    public void setTiny_url (String tiny_url)
    {
        this.tiny_url = tiny_url;
    }
}