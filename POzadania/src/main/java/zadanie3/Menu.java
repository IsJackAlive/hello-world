package zadanie3;

import java.util.Scanner;

public abstract class Menu {
    Scanner sc = new Scanner(System.in);
    
    public double wczytaj(String wartosc){
        
        System.out.println("Wprowadz " + wartosc);
        double a = sc.nextInt();
        
        return a;
    }
    
    public void Kwadrat(){
        
        Kwadrat kwadrat = new Kwadrat(0);
        
        System.out.println("Co chcesz policzyc: ");
        System.out.println("1. pole figury");
        System.out.println("2. obwod figury");
        
            int userChoice = sc.nextInt();
            switch(userChoice){
                
                case 1 -> {
                    kwadrat.setA(wczytaj("a"));
                    System.out.println(kwadrat.Pole());
                }
                case 2 -> {System.out.println();
                    kwadrat.setA(wczytaj("a"));
                    System.out.println(kwadrat.Obwod());
                }
            }
    }
    
    public void Prostokat(){
        Prostokat prostokat = new Prostokat(0,0);
        
        System.out.println("Co chcesz policzyc: ");
        System.out.println("1. pole figury");
        System.out.println("2. obwod figury");
        
        int userChoice = sc.nextInt();
            switch(userChoice){
                
                case 1 -> {
                    prostokat.setA(wczytaj("a"));
                    prostokat.setB(wczytaj("b"));
                    System.out.println(prostokat.Pole());
                }
                case 2 -> {System.out.println();
                    prostokat.setA(wczytaj("a"));
                    prostokat.setB(wczytaj("b"));
                    System.out.println(prostokat.Obwod());
                }
            }
    }
    
    public void Kolo(){
        Kolo kolo = new Kolo(0);
        
        System.out.println("Co chcesz policzyc: ");
        System.out.println("1. pole figury");
        System.out.println("2. obwod figury");
        
        int userChoice = sc.nextInt();
            switch(userChoice){
                
                case 1 -> {
                    kolo.setR(wczytaj("r"));
                    System.out.println(kolo.Pole());
                }
                case 2 -> {System.out.println();
                    kolo.setR(wczytaj("r"));
                    System.out.println(kolo.Obwod());
                }
            }
    }
}