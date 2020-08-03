import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by KPS on 8/3/2020.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("List before reversing :\n" + list_Strings);
        Collections.reverse(list_Strings);
        System.out.println("List after reversing :\n" + list_Strings);
    }
}
