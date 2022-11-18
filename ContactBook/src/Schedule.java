import java.util.ArrayList;
import java.util.*;

public class Schedule {
    ArrayList<Contact> cont;

    public Schedule(){
        cont = new ArrayList<Contact>();
    }

    public void AddContact(Contact c){
        cont.add(c);
    }

    public Contact Search(String name){
        System.out.println(">>> Buscar contato <<<");
        for(int i=0;i<cont.size();i++){
            if(cont.get(i).getName().equals(name))
                return cont.get(i);
        }
        return null;
    }

    public boolean Delete(String name){
        Contact contSearched;
        contSearched = Search(name);
        System.out.println(">>> Excluir contato <<<");
        if(contSearched == null){
            return false;
        } else {
            cont.remove(contSearched);
            return true;
        }
    }

    public void ChangeInfo(String name){
        Contact contSearched;
        contSearched = Search(name);
        Scanner scan = new Scanner(System.in);

        System.out.println(">>> Modificar dados <<<");
        if(contSearched == null)
            System.out.println("**contato nao encontrado**");
        else
            System.out.println("-> Insira seu nome: ");
            contSearched.setName(scan.nextLine());
            System.out.println("-> Insira o seu endereco: ");
            contSearched.setAddress(scan.nextLine());
            System.out.println("-> Insira o seu telefone: ");
            contSearched.setTelephone(scan.nextLine());
            System.out.println("-> Insira o seu email: ");
            contSearched.setEmail(scan.nextLine());       
        scan.close(); 
    }

    public void showContact(){
        System.out.println(">>> Lista de Contatos <<<");
        for(Contact c : cont){
            System.out.println("Nome: " + c.getName());
            System.out.println("Telefone: " + c.getTelephone());
            System.out.println("E-mail: " + c.getEmail());
            System.out.println("Endereço" + c.getAddress());        
        }
    }
}
