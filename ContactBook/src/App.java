import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner insert = new Scanner(System.in);
        Schedule s = new Schedule();
        Contact c;       
        String name, address, telephone, email;
        int opChoosed;

        do{
            opChoosed = Menu();

            switch(opChoosed){
                case 1:            
                    System.out.println(">>> Cadastrar Contato <<<");
                    System.out.println("-> Digite seu nome: ");
                        name = insert.nextLine();
                    System.out.println("-> Digite seu endereco: ");
                        address = insert.nextLine();
                    System.out.println("-> Digite seu email: ");
                        email = insert.nextLine();
                    System.out.println("-> Digite o seu telefone: ");
                        telephone = insert.nextLine();
                    c = new Contact(name, address, telephone, email);
                    s.AddContact(c);
                    break;
                case 2: 
                    System.out.println(">>> Buscar Contato <<<");
                    System.out.println("-> Digite o nome a ser buscado:");
                    name = insert.nextLine(); 
                    c = s.Search(name);
                    if (c == null) {
                        System.out.println("!Erro contato não encontrado");
                    } else {
                        c.Print();
                    }
                    break;
                case 3: 
                    System.out.println(">>> Modificar <<<");
                    System.out.println("Digite nome do usuário a ser modificado");
                    name = insert.nextLine(); 
                    s.ChangeInfo(name);
                    break; 
                case 4:
                    System.out.println(">>> Excluir contato <<<");
                    System.out.println("Digite o nome do contato a ser excluído:");
                    name = insert.nextLine(); 
                    s.Delete(name);
                    break; 
                case 5: 
                    System.out.println(">>> Listando todos os contatos <<<");
                    s.showContact();
                    break;
                case 6:
                    System.out.println("> Finalizando programa...");
            }
        }while(opChoosed != 6);

        insert.close();
    }

    public static int Menu(){
        Scanner insert = new Scanner(System.in);
        int op;
        System.out.println(">>> MENU <<<");
        System.out.println("[1] Cadastrar Contato");
        System.out.println("[2] Buscar Contato pelo nome e exibir seus dados");
        System.out.println("[3] Modificar dados do Contato");
        System.out.println("[4] Excluir Contato");
        System.out.println("[5] Vizualizar todos os Contatos");
        System.out.println("[6] Sair");

        do{
            System.out.println("> Escolha uma opcao: ");
            op = insert.nextInt();
        } while(op < 1 || op > 6);
        insert.close();
        return op;        
    }

    public static void RegisterContact(Contact c, Schedule s){
        
    }
}
