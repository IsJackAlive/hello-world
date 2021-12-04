package zadanie2;

public class Main {
    public static void main(String[] args){
        
        Samochod peugeot = new Samochod(200,"Peugeot",1400);
        Samochod mercedes = new Samochod(210,"Mercedes",1700);
        Samochod toyota = new Samochod(180,"Toyota",1100);
        Samochod mazda = new Samochod(210,"Mazda",1400);
        
        Porownywarka porownaj = new Porownywarka();
        
        System.out.println("Porownanie Peugot'a oraz Toyoty");
        porownaj.speedVs(peugeot.getSpeed(),peugeot.getBrand(), toyota.getSpeed(), toyota.getBrand());
    
        System.out.println("Porownanie Mazdy oraz Mercedesa");
        porownaj.speedVs(mazda.getSpeed(),mazda.getBrand(), mercedes.getSpeed(), mercedes.getBrand());
    }
}
