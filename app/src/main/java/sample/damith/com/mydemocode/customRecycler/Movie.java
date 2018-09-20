package sample.damith.com.mydemocode.customRecycler;

public class Movie {
    public Movie(String name, String date) {
        this.name = name;
        this.date = date;
    }

    private String name;
    private String date;
    private String id;
    private String color;

    public Movie(String name, String date, String id, String color) {
        this.name = name;
        this.date = date;
        this.id = id;
        this.color = color;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
