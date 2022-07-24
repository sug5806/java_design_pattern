package java_io_decorator;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                                new BufferedInputStream(
                                    new FileInputStream("decorator/src/java_io_decorator/test.txt")));

            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
