package zadanie1;

public class guest {
    private String name;
    private String meal; 
    private int phoneNumber;
    private boolean isVegan;

    
    public guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isIsVegan() {
        return isVegan;
    }

    public void setIsVegan(boolean isVegan) {
        this.isVegan = isVegan;
    }
    
    public void displayGuestList(){
        System.out.println("Imię: " + name );
        System.out.println("Posilek: " + meal );
        System.out.println("Telefon: " + phoneNumber );
        
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println("Weganin: " + isVeganString );
    }
}
