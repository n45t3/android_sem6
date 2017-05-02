package app.giantapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Krystian on 2017-05-01.
 */

public class GameRowModel
{
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("deck")
    private String deck;

    @SerializedName("image")
    private Image image;

    @SerializedName("platforms")
    private Platform[] platforms;

    @SerializedName("expected_release_year")
    private String expected_release_year;

    @SerializedName("expected_release_month")
    private String expected_release_month;

    @SerializedName("expected_release_day")
    private String expected_release_day;

    @SerializedName("original_release_date")
    private String original_release_date;

    @SerializedName("number_of_user_reviews")
    private String number_of_user_reviews;

    public GameRowModel(String id, String name, String deck, Image image,
                        Platform[] platforms, String expected_release_year,
                        String expected_release_month, String expected_release_day,
                        String original_release_date, String number_of_user_reviews) {
        this.id = id;
        this.name = name;
        this.deck = deck;
        this.image = image;
        this.platforms = platforms;
        this.expected_release_year = expected_release_year;
        this.expected_release_month = expected_release_month;
        this.expected_release_day = expected_release_day;
        this.original_release_date = original_release_date;
        this.number_of_user_reviews = number_of_user_reviews;
    }

    public Image getImage ()
    {
        return image;
    }

    public void setImage (Image image)
    {
        this.image = image;
    }

    public Platform[] getPlatforms ()
    {
        return platforms;
    }

    public void setPlatforms (Platform[] platforms)
    {
        this.platforms = platforms;
    }

    public String getExpected_release_year ()
    {
        return expected_release_year;
    }

    public void setExpected_release_year (String expected_release_year)
    {
        this.expected_release_year = expected_release_year;
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

    public String getNumber_of_user_reviews ()
    {
        return number_of_user_reviews;
    }

    public void setNumber_of_user_reviews (String number_of_user_reviews)
    {
        this.number_of_user_reviews = number_of_user_reviews;
    }

    public String getExpected_release_day ()
    {
        return expected_release_day;
    }

    public void setExpected_release_day (String expected_release_day)
    {
        this.expected_release_day = expected_release_day;
    }

    public String getDeck ()
    {
        return deck;
    }

    public void setDeck (String deck)
    {
        this.deck = deck;
    }

    public String getExpected_release_month ()
    {
        return expected_release_month;
    }

    public void setExpected_release_month (String expected_release_month)
    {
        this.expected_release_month = expected_release_month;
    }
}