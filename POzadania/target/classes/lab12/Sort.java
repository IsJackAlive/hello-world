package lab12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author roman
 */
public class Sort {

    public static void main(String[] args) {
     
        String [] suits = {"Trefl", "Karo", "Kier", "Pik"};
        
        List <String> list = Arrays.asList(suits);
        System.out.println("Nieposortowane elementy tablicy: "+list);
        
        Collections.sort(list);
        System.out.println("Posortowane elmenty tablicy rosnąco: " +list);
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Posortowane elementy tablicy malejąco: " +list);
    }

}
