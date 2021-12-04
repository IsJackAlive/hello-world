package lab12;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author roman
 */
public class SetTest {

    public static void main(String[] args) {
        String[] colors = {"czerwony", "bialy", "niebieski", "zieliony", "szary", "pomaranczowy", "brazowy", "bialy", "czarny", "zolty", "szary", "pomaranczowy"};

        List<String> list = Arrays.asList(colors);
        System.out.println("Lista: " + list);

        printNonDuplicates(list);

    }

    private static void printNonDuplicates(Collection<String> values) {

        Set<String> set = new HashSet<>(values);

        System.out.printf("Po usunięciu duplikatów: ");

        for (String value : set) {
            System.out.printf(" %s,", value);
        }

        System.out.println("");
    }

}
