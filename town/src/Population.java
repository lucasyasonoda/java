public class Population {
    private double salary;
    private int age;
    private int nSons;    

    public Population(double salary, int age, int nSons) {
        this.salary = salary;
        this.age = age;
        this.nSons = nSons;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getnSons() {
        return nSons;
    }
    public void setnSons(int nSons) {
        this.nSons = nSons;
        }    
    
}
