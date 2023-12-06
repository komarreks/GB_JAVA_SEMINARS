package seminar02;

import java.util.Scanner;

public class part01 {
    public static void main(String[] args) {
        System.out.print("Введите число N:");
        int n = new Scanner(System.in).nextInt();

        char c1 = 'a';
        char c2 = 'b';

        StringBuilder sb = new StringBuilder();

        while (n>0){
            sb.append(n%2>0 ? c1 : c2);
            n--;
        }

        System.out.println(sb.toString());
    }
}
