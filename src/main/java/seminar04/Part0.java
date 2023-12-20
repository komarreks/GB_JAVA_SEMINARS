package seminar04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Part0 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        testTime(list1);
        testTime(list2);
        System.out.println(sumElem(list1));
        System.out.println(sumElem(list2));
    }

    static long sumElem(List<Integer> list){
        long sum = 0;
        long timeStart = System.currentTimeMillis();
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum);
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }

    static long testTime(List<Integer> list){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
}
