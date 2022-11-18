public class Owner {
    private String name;
    private String telephone;
    private Animal pet;
    
    public Owner(String name, String telephone, Animal pet) {
        this.name = name;
        this.telephone = telephone;
        this.pet = pet;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public Animal getPet() {
        return pet;
    }
    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public void Print(){
        System.out.println(">>> Owner <<<");
        System.out.println("-> Name: " + getName());
        System.out.println("-> Telephone: " + getTelephone());
        System.out.println(">> Pet <<");
        System.out.println("-> Name: " + getPet().getName());
        System.out.println("-> Breed: " + getPet().getBreed());
        System.out.println("-> Color: " + getPet().getColor());
        System.out.println("-> Year of birth: " + getPet().getBreed());
        
    }
}
