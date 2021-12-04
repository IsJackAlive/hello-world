package zadanie3;

public class Kwadrat implements Figura{
    
    double a;
    
    public Kwadrat(double a){
        this.a = a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
    
    @Override
    public double Pole() {
        return a*a;
    }

    @Override
    public double Obwod() {
        return 4*a;
    }
    
}

