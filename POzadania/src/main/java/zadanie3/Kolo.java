package zadanie3;

public class Kolo implements Figura{
    
    double r;
    
    public Kolo(double r){
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

        @Override
    public double Pole() {
        return Math.PI*r*r;
    }

    @Override
    public double Obwod() {
        return 2*Math.PI*r;
    }
    
}
