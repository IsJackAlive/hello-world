package zadanie2;

public class Pojazd {
    int speed;
    float weight;
    String brand;
    
    Pojazd(int speed, String brand, float weight){
        this.speed = speed;
        this.brand = brand;
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public float getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }
    
}
