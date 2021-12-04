package zadanie4;

public class Main {
    public static void main(String[] args){
        
        int a = 31;
        int b = 0;
        
        try{
            System.out.println(dziel(a,b));
        } catch(ArithmeticException e){
            System.out.println("nie dzielimy przez 0");
        }
    }
        private static int dziel(int a, int b){
            return a/b;
        }
    }
