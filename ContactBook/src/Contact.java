public class Contact {
    private String name;
    private String address;
    private String telephone;
    private String email;

    //The arguments is with the "_" just to better observation and readings
    public Contact(String _name, String _address, String _telephone, String _email){
        this.name = _name;
        this.address = _address;
        this.telephone = _telephone;
        this.email = _email;
    }

    public Contact(){
        this.name = "";
        this.address = "";
        this.telephone = "";
        this.email = "";
    }

    public void setName(String _name){
        this.name = _name;
    }
    
    public void setAddress(String _address){
        this.address = _address;
    }

    public void setTelephone(String _telephone){
        this.telephone = _telephone;
    }

    public void setEmail(String _email){
        this.email = _email;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getTelephone(){
        return telephone;
    }

    public String getEmail(){
        return email;
    }

    public void Print(){
        System.out.println(">>> " + getName() + " <<<");
        System.out.println("-> Endereco: " + getAddress());
        System.out.println("-> Telefone: " + getTelephone());
        System.out.println("-> Email: " + getEmail());
    }
}
