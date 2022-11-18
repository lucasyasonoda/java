import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Population pop[] = new Population[50];
        Scanner scan = new Scanner(System.in);
        int avgAge=0, highestAge=0, countMen=0, countWom_=0;

        for(int i=0;i<50;i++){
            pop[i].setSex(scan.nextLine().charAt(0));
            pop[i].setHeight(scan.nextInt());
            pop[i].setAge(scan.nextInt());
            pop[i].setEyeColor(scan.nextLine().charAt(0));
        }
        scan.close();

        for(int i=0;i<50;i++){
            if(pop[i].getEyeColor() == 'C' || pop[i].getEyeColor() == 'c') 
                avgAge += pop[i].getAge();
            if(pop[i].getAge() > highestAge)
                highestAge = pop[i].getAge();
            if(pop[i].getSex() == 'H' || pop[i].getSex() == 'h')
                countMen++;
            if((pop[i].getSex() == 'F' || pop[i].getSex() == 'f') && (pop[i].getAge() >= 20 &&pop[i].getAge() <= 45) && (pop[i].getEyeColor() == 'V' || pop[i].getEyeColor() == 'v'))
                countWom_++;
        }


        System.out.println(">> Media de idade: " + avgAge);
        System.out.println(">> Maior idade: " + highestAge);
        System.out.println(">> Quantidade de homens: " + countMen);
        System.out.println(">> Quantidade de mulheres com idade entre 20 e 45 anos com olhos verdes: " + countWom_);
    }
}
