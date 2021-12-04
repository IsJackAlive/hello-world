package lab12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author roman
 */
public class SortTime {

    public static void main(String[] args) {
        List<Time2> list = new ArrayList<>();

        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 5, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));

        System.out.println("Nieposortowane elementy tablicy: " + list);

        Collections.sort(list, new TimeComparator());

        System.out.println("Posortowane elementy tablicy: " + list);

    }

}
