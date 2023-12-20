package seminar04;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Part02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean work = true;
        while (work){
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    for (String s: list){
                        System.out.println(s);
                    }
//                    ListIterator<String> iterator = list.listIterator(list.size());
//                    while (iterator.hasPrevious()){
//                        System.out.println(iterator.previous());
//                    }
//                    for (int i = list.size()-1; i >= 0; i--) {
//                        System.out.println(list.get(i));
//                    }
                    break;
                case "revert":
                    list.remove(0);
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    list.add(0, line);
            }
        }
    }
}
