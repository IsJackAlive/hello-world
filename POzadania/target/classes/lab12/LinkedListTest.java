package lab12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author roman
 */
public class LinkedListTest {

    public static void main(String[] args) {

        String[] colors = {"czarny", "żółty", "zieliony", "niebieski", "fioletowy", "srebrny"};
        List<String> list1 = new LinkedList<>(Arrays.asList(colors));

        for (String color : colors) {
            list1.add(color);
        }

        String[] colors2 = {"złoty", "biały", "brązowy", "niebieski", "szary", "srebrny"};
        List<String> list2 = new LinkedList<>();

        for (String color : colors2) {
            list2.add(color);
        }

        list1.addAll(list2);
        list2 = null;
        printList(list1);

        convertToUppercaseStrings(list1);
        printList(list1);

        printReversedList(list1);

        colors = list1.toArray(new String[list1.size()]);
        System.out.println("");
        for (String color : colors) {
            System.out.printf(" " + color);
        }

    }

    private static void printList(List<String> list) {
        System.out.println("Lista:");

        for (String color : list) {
            System.out.printf("%s ", color);
        }

        System.out.println("");
    }

    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.println("Odwrocona lista: ");

        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    }

}
