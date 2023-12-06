package seminar02.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        boolean iteration = true;

        createLog();

        while (iteration){
            iteration = false;
            for (int i = 0; i < mas.length-1; i++) {
                if (mas[i]>mas[i+1]){
                    int bufer = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = bufer;
                    iteration = true;
                }
            }
            addLogRecord(mas);
            System.out.println(Arrays.toString(mas));
        }
    }

    public static void createLog(){
        File file = new File("log.txt");
        if (file.exists()){
            file.delete();
        }

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void addLogRecord(int[] mas){
        try (FileWriter fw = new FileWriter("log.txt", true)){
            Date date = new Date();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");

            fw.write(dateFormat.format(date) + " " + Arrays.toString(mas) + "\n");

            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 4, 8, 3, 1};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}