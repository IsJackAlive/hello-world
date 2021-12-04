package zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        boolean shouldContinue =true;
        Menu menu = new Menu() {};
        
        while (shouldContinue){
            System.out.println("Wybierz figure: ");
            System.out.println("1. kwadrat");
            System.out.println("2. prostokat");
            System.out.println("3. kolo");
            System.out.println("4. wyjscie");
            
            int userChoice = sc.nextInt();
            
            switch(userChoice)
            {
                case 1 -> menu.Kwadrat();
                case 2 -> menu.Prostokat();
                case 3 -> menu.Kolo();
                case 4 -> shouldContinue = false;
            }
        }
    }
}
