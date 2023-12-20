package seminar03;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int item : arr){
            list.add(item);
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Minimum is " + Collections.min(list));
        System.out.println("Maximum is " + Collections.max(list));

        int avg = 0;

        for(int item : list){
            avg = avg + item;
        }

        System.out.println("Average is " + avg/list.size());

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}