package zadanie3;

public class Prostokat implements Figura{
    
    double a;
    double b;
    
    public Prostokat(double a, double b){
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
        @Override
    public double Pole() {
        return a*b;
    }

    @Override
    public double Obwod() {
        return 2*(a+b);
    }
}
