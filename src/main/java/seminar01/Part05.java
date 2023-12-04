package seminar01;
/*
Во фразе "Добро пожаловать на курс по Java" переставить слова
в обратном порядке.
*/
public class Part05 {
    public static void main(String[] args) {
        String speech = "Добро пожаловать на курс по Java";

        String[] speechArr = speech.split(" ");

        for (int i = speechArr.length - 1; i >= 0; i--){
            System.out.print(speechArr[i] + " ");
        }
    }
}
