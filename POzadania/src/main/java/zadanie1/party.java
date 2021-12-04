package zadanie1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class party {
    
    private List <guest> guests = new ArrayList<>();
    private Set <String> meals = new HashSet<>();
    private Map <Integer, guest> phoneToGuest = new HashMap<>();
    
    Scanner scanner = new Scanner(System.in); 
    
    public void addGuest(){
        
        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine();
        
        System.out.println("Preferowany posiłek");
        String meal = scanner.nextLine();
        
        System.out.println("Numer telefonu");
        int phoneNumber = Integer.valueOf(scanner.nextLine());
       
        System.out.println("Czy weganin (y/n)");
        String isVeganString = scanner.nextLine();
        
        boolean isVegan;
        
        if (isVeganString.equals("y")){
            isVegan = true;
        }   
        else{
            isVegan = false;
        }
        
        guest Guest1 = new guest(name, meal, phoneNumber, isVegan);
        
        meals.add(meal);
        phoneToGuest.put(phoneNumber, Guest1);
        guests.add(Guest1);
    }
    
    public void displayMeals(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }
    
    public void displayByPhone(){
        System.out.println("Podaj numer telefonu");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        
        guest Guest1 = phoneToGuest.get(phoneNumber);
        
        Guest1.displayGuestList();
    }
    
    public void displayGuest(){
        for (guest guest: guests)
        {
            System.out.println(guest);
            guest.displayGuestList();
        }
    }
}