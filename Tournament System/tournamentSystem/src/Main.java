import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var times   = new ArrayList<teams>();

    }

    public static teams registerTeam(){
        teams times = new teams();
        var scanInt = new Scanner(System.in);
        var scanStr = new Scanner(System.in);
        var scan = new Scanner(System.in);
        String nome, stts;
        int titulos;
        String[] equipe = new String[12];
        Boolean el = false;
        Object obj = new Object();
        System.out.println("*** Cadastro de time ***");
            System.out.println("> Insira o nome da equipe: ");
                System.out.println(">> ");
                nome = scanStr.nextLine();
            System.out.println("> Insira quantos títulos essa equipe possui: ");
                System.out.println(">>");
                titulos = scanInt.nextInt();
        System.out.println("> Deseja cadastrar o elenco?");
                el = scan.nextBoolean();
                if(!el){
                    times = new teams(nome, titulos, null);
                }else {
                    for(int i=0;i<24;i++){
                        System.out.println("-----------");
                        System.out.println("> Insira o nome do jogador: ");
                            System.out.println(">>");
                            times.getSquad().getPlayers().get(i).setName(scan.nextLine());
                        System.out.println("> Insira o numero do jogador: ");
                            System.out.println(">>");
                            times.getSquad().getPlayers().get(i).setNumber(scan.nextInt());
                        System.out.println("> O jogador sera titular ou reserva? (T/R)");
                            stts = scan.nextLine();
                            if(stts.equals("T")){
                                times.getSquad().getPlayers().get(i).setStatus(true);
                            }else if(stts.equals("R")){
                                times.getSquad().getPlayers().get(i).setStatus(false);
                            }
                    }
                }


        return times;
    }
}