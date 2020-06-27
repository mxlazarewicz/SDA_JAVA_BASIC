package homeWork1mz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex5_Array {
    public static void countriesPrint() {
        List<String> countries = Arrays.asList("Germany", "Panama", "Australia");
        Iterator<String> countriesIterator = countries.iterator();
        while (countriesIterator.hasNext()) {
            System.out.println(countriesIterator.next());
        }
    }
}