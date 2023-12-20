package seminar03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/*
Р—Р°РїРѕР»РЅРёС‚СЊ СЃРїРёСЃРѕРє РґРµСЃСЏС‚СЊСЋ СЃР»СѓС‡Р°Р№РЅС‹РјРё С‡РёСЃР»Р°РјРё.
РћС‚СЃРѕСЂС‚РёСЂРѕРІР°С‚СЊ СЃРїРёСЃРѕРє РјРµС‚РѕРґРѕРј sort() Рё РІС‹РІРµСЃС‚Рё РµРіРѕ РЅР° СЌРєСЂР°РЅ.
 */
public class Part01 {
    public static void main(String[] args) {
        List<Integer> lst = createList(0,10,10);
        System.out.println(lst);
        //lst.sort(Comparator.reverseOrder());
        lst.sort(Comparator.reverseOrder());
        System.out.println(lst);
    }

    static List<Integer> createList(int min, int max, int count){
        Random random = new Random();
        List<Integer> lst = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            lst.add(random.nextInt(min, max+1));
        }

        return lst;
    }
}
