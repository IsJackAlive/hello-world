package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author roman
 */
public class ArrayListTest {

    public static void main(String[] args) {
        String[] colors = {"Magneta", "Czerwony", " Biały", " Niebieski", "Cyjan"};
        List<String> list = new ArrayList<String>();

        for (String color : colors) {
            list.add(color);
        }

        String[] removeColors = {"Czerwony", " Biały", " Niebieski"};
        List<String> removeList = new ArrayList<String>();

        for (int count = 0; count < removeList.size(); count++) {
            removeList.add(removeColors[count]);
        }

        System.out.println("ArrayList: ");

        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));
        }

        removeColors(list, removeList);

        System.out.printf("%nArrayList po wywolaniu removeColors: %n");

        for (String color : list) {
            System.out.printf("%s ", color);
        }

    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {

        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove();
            }

        }

    }

}
