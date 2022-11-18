public class Wine {
    private String name;
    private String type;
    private int yFab;
    private double price;
    
    
    public Wine(String name, String type, int yFab, double price) {
        setName(name);
        this.type = type;
        this.yFab = yFab;
        this.price = price;
    }            
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getyFab() {
        return yFab;
    }
    public void setyFab(int yFab) {
        this.yFab = yFab;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void Print(){
        System.out.println(">> Wine name: " + getName);
        System.out.println(">> Wine type: " + getType);
        System.out.println(">> Wine year of fabrication: " + getyFab);
        System.out.println(">> Wine price: " + getPrice);
    }
    
}
