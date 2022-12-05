public class player {
    private String name;
    private int number;
    private Boolean status; // false = substitutes || true = holder

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public player(String name, int number, Boolean status) {
        this.name = name;
        this.number = number;
        this.status = status;
    }
}
