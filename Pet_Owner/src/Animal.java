public class Animal {
    private String name;
    private String breed;
    private String color;
    private int yBirth;
       
    public Animal(String name, String breed, String color, int yBirth) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.yBirth = yBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getyBirth() {
        return yBirth;
    }

    public void setyBirth(int yBirth) {
        this.yBirth = yBirth;
    }

    

}
