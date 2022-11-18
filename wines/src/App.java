import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Wine wines [] = new Wine[3];
        Scanner scan = new Scanner(System.in);
        double aux = 0;
        String nome = "", nomeY = "";
        int yAux = 0;

        for(int i=0;i<3;i++){
            System.out.println("------------------------------");
            System.out.println("Digite o nome do vinho: ");
            wines[i].setName(scan.nextLine());
            System.out.println("Digite o tipo do vinho: ");
            wines[i].setType(scan.nextLine());
            System.out.println("Digite o ano de fabricacao do vinho: ");
            wines[i].setyFab(scan.nextInt());
            System.out.println("Digite o preco do vinho: ");
            wines[i].setPrice(scan.nextDouble());            
        }
        scan.close();

        for(int i=0;i<3;i++){            
            if(wines[i].getPrice() > aux){
                aux = wines[i].getPrice();
                nome = wines[i].getName();
            }
            if(wines[i].getyFab() < yAux){
                yAux = wines[i].getyFab();
                nomeY = wines[i].getName();
            }     
        }

        System.out.println(">> O vinho mais caro eh " + nome);
        System.out.println(">> O vinho mais velho eh " + nomeY);

    }
}
