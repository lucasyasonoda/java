public class teams {
    private String name;
    private int titles;
    private squad squad;

    public teams(String name, int titles, squad squad) {
        this.name = name;
        this.titles = titles;
        this.squad = squad;
    }
    public teams(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

    public void setSquad(squad squad) {
        this.squad = squad;
    }

    public String getName() {
        return name;
    }

    public int getTitles() {
        return titles;
    }

    public squad getSquad() {
        return squad;
    }
}
