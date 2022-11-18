public class Population {
    private char sex;
    private int height;
    private int age;
    private char eyeColor;

    public Population(char sex, int height, int age, char eyeColor) {
        this.sex = sex;
        this.height = height;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(char eyeColor) {
        this.eyeColor = eyeColor;
    }
}
