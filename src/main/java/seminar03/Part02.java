package seminar03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Part02 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add("kujgb");
        list.add('c');
        list.add(null);
        list.add(3.1444);
        System.out.println(list);
// for (int i = 0; i < list.size(); i++) {
// if (list.get(i) instanceof Integer) {
// list.remove(i);
// i--;
// }
// }

        Iterator<Object> iterator = list.iterator();
// while (iterator.hasNext()) {
// if (iterator.next() instanceof Integer) {
// iterator.remove();
// }
// }

        list.removeIf(x -> x instanceof Integer);

        System.out.println(list);
    }
}
