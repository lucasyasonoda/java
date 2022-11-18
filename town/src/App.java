import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Population pop[] = new Population[20];
        Scanner scan = new Scanner(System.in);
        double highestS=0, avgSons=0, avgSalary = 0;

        for(int i=0;i<20;i++){
            pop[i].setSalary(scan.nextDouble());
            pop[i].setAge(scan.nextInt());
            pop[i].setnSons(scan.nextInt());
        }

        for(int i=0;i<20;i++){
            if(pop[i].getSalary() > highestS)
                highestS = pop[i].getSalary();
            avgSalary = pop[i].getSalary();
            avgSons = pop[i].getnSons();
        }
        avgSalary = avgSalary/pop.length;
        avgSons   = avgSons/pop.length;

        System.out.println(">> Media de salarios: " + avgSalary);
        System.out.println(">> Media de filhos: " + avgSons);
        System.out.println(">> Maior salario: " + highestS);
    }
}
