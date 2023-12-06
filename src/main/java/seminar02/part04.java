package seminar02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class part04 {
    public static void main(String[] args){
        File file = new File("test.txt");

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 101; i++) {
            sb.append("TEST");
        }

        try {
            FileWriter fw = new FileWriter(file);
            fw.write(sb.toString());
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
