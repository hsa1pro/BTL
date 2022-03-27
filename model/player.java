package model;

public class player {
    private String name;
    private String time;

    public player(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public player() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
