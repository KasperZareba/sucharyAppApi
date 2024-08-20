package pl.spinplay.sucharyappapi.model;

public class Suchary {
    private String joke;
    private int id;

    public Suchary(String joke, int id) {
        this.joke = joke;
        this.id = id;
    }
    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
