package zadanie2;

public class Porownywarka {
    
    public void speedVs(int s1,String car1,int s2, String car2){
        if(s1 == s2)
            System.out.println(car1 + " osiaga ta sama predkosc co " + car2);
        else
            if(s1 > s2)
            System.out.println(car1 + " osiaga wyzsza predkosc (+" + (s1-s2) + "kmph)");
        else
            System.out.println(car2 + " osiaga wyzsza prednosc(+" + (s2-s1) + "kmph)");
    }
}
