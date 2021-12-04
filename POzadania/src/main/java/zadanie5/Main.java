package zadanie5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        ClubMember m1 = new ClubMember("Piotr", "Łazarz",4442);
        ClubMember m2 = new ClubMember("Dominik", "Jasnik",3331);
        ClubMember m3 = new ClubMember("Bartosz", "Pilec",4435);
        ClubMember m4 = new ClubMember("Łukasz", "Warzywniak",8364);
        
       System.out.println("Członkowie klubu Lemon: ");
       System.out.println(m1.toString());
       System.out.println(m2.toString());
       System.out.println(m3.toString());
       System.out.println(m4.toString());
       System.out.println("łączna liczba członków: " + ClubMember.getID());
       
       ClubMember.getPhoneNumber(m2);
       
      System.out.println( ClubMember.showFounder());
//___________________________________________________________
      
      System.out.println("Wyswietl osobe ktorej imie zaczyna sie litera: " + ClubMember.getID());

    }
    
    boolean czyIstnejeNa(ClubMember member){
        
    Scanner sc = new Scanner(System.in);
    String l = sc.nextLine();
    return member.firstName.startsWith(l);
    }
}
