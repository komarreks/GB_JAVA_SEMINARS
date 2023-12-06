package seminar02;

import java.util.Scanner;

public class part03 {
    public static void main(String[] args) {
        System.out.println("Введите строку для проверки");
        String str = new Scanner(System.in).nextLine();

        System.out.println(isPolyndrom(str));
    }

    public static boolean isPolyndrom(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = str.length()-1; i>-1; i--) {
            sb.append(str.charAt(i));
        }

        if (str.equals(sb.toString())){return true;}

        return false;
    }
}
