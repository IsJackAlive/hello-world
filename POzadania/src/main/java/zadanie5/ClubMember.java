package zadanie5;

public class ClubMember {
    String firstName;
    String name;
    private static int ID = 0;
    private int phoneNumber;
    private int memberID;
    
    public ClubMember(String firstName,String name,int phoneNumber){
        this.firstName = firstName;
        this.name = name;
        this.memberID = ID+=1;
        this.phoneNumber = phoneNumber;
        //System.out.println("Imie: " + firstName + " Nazwisko: "+ name + " ID: " + memberID);
    }

    static final ClubMember founder = new ClubMember("Borys", "Makowiecki", 3145);
    
    public static String showFounder(){
        return "Założyciel klubu: " + founder.firstName + " " + founder.name;
    }
    
    static void getPhoneNumber(ClubMember person) {
        System.out.println( "Numer telefonu "+ person.firstName +"a: " + person.phoneNumber);
    }

    public static int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Imie: " + firstName + " Nazwisko: "+ name + " ID: " + memberID +" Telefon: " + phoneNumber;
    }
    
}
