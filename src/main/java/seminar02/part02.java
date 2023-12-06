package seminar02;

import java.util.Scanner;

public class part02 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        String string = new Scanner(System.in).nextLine();

        StringBuilder sb = new StringBuilder();

        char currentChar = string.charAt(0);
        sb.append(currentChar);

        for (int i = 1; i < string.length(); i++) {
            if (currentChar!=string.charAt(i)){
                currentChar = string.charAt(i);
                sb.append(currentChar);
            }
        }

        System.out.println(sb.toString());
    }
}
