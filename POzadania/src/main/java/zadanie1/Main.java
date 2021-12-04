package zadanie1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue =true;
        
        party party = new party();
        
        while (shouldContinue){
            System.out.println("Wybierz opcje: ");
            System.out.println("1. Wyswietl gosci");
            System.out.println("2. Dodaj goscia");
            System.out.println("3. Wyswietl zamówione potrawy");
            System.out.println("4. Numer telefonu");
            System.out.println("5. Wyjscie");
            
            int userChoice = scanner.nextInt();
            
            switch(userChoice)
            {
                case 1 -> {System.out.println("Wybrales 1");
                party.displayGuest();
                }
                case 2 -> {System.out.println("Wybrales 2");
                party.addGuest();
                }
                case 3 -> {System.out.println("Wybrales 3");
                party.displayMeals();
                }
                case 4 -> {System.out.println("Wybrales 4");
                party.displayByPhone();
                }
                case 5 -> shouldContinue= false;
            }
        }
    }
}