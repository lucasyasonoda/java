import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Subject> subjects = new ArrayList<Subject>();
        var scan = new Scanner(System.in);
        int op;

        do{
            Menu();
            op = scan.nextInt();
            switch(op){
                case 1:
                    subjects.add(RegisterSub());
                    break;
                case 2:
                    Search(subjects);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(op != 5);

    }

    public static void Menu(){
        System.out.println(">>> Menu <<<");
        System.out.println("[1] Cadastrar Professor e Diciplina");
        System.out.println("[2] Buscar professores por diciplina");
        System.out.println("[3] Buscar professores por titulação");
        System.out.println("[4] Mostrar todas as diciplinas que pelo menos um professor leciona");
        System.out.println("[5] Sair");
        System.out.println(">>");
    }

    public static Subject RegisterSub(){
        String subName, teacherName, teacherTitulation;
        int subWl, teacherWl;
        var scanStr = new Scanner(System.in);
        var scanInt = new Scanner(System.in);

        System.out.println(">>> Registering Subject and Teacher <<<");
        System.out.println(">> Insert the subject name: ");
            subName = scanStr.nextLine();
        System.out.println(">> Insert the subject workload: ");
            subWl = scanInt.nextInt();
        System.out.println(">> Insert the teacher's name: ");
            teacherName = scanStr.nextLine();
        System.out.println(">> Insert the teacher workload: ");
            teacherWl = scanInt.nextInt();
        System.out.println(">> Insert the teacher titulation: ");
            teacherTitulation = scanStr.nextLine();

        Teacher t = new Teacher(teacherName, teacherTitulation, teacherWl);
        Subject s = new Subject(subName,subWl,t);
        return s; 
    }

    public static void Search(ArrayList<Subject> subs){
        var scan = new Scanner(System.in);
        String sub;

        System.out.println(">>> Search subject <<<");
        System.out.println(">> Insert the subject: ");
            sub = scan.nextLine();

        for(int i=0;i<subs.size();i++)
            if(subs.get(i).getName().equals(sub))
                System.out.println("The teacher's name is " + subs.get(i).getTeacher().getName());
            
        
    }
}
