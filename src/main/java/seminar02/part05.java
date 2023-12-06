package seminar02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class part05 {
    public static void main(String[] args) throws IOException {
        File dir = new File("/");

        File[] dirList = dir.listFiles();

        StringBuilder sb = new StringBuilder();

        for (File file : dirList) {
            sb.append(file.getCanonicalFile() + "\n");
        }

        File output = new File("part05.txt");

        if (!output.exists()){output.createNewFile();}

        FileWriter fw = new FileWriter(output);

        fw.write(sb.toString());
        fw.flush();
        fw.close();
    }
}
