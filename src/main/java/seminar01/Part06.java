package seminar01;

import java.util.Scanner;

/*
Реализовать функцию возведения числа а в степень b. a, b из Z.
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
 */
public class Part06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите степень:");
        double b = sc.nextDouble();
        sc.nextLine();

        System.out.println(degree(a,b));
    }

    public static double degree(double a, double b){
        return Math.pow(a,b);
    }
}
