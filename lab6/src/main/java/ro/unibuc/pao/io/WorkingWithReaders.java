package ro.unibuc.pao.io;

import java.io.*;
import java.util.Scanner;

public class WorkingWithReaders {

    private static void write() {

    }

    public static void main(String args[]) throws IOException {

        // Files can be loaded automatically from the classpath. The classloader will check all folders on the
        // classpath and see if the indicated resource can be found in any of them, returning the first match
        // (if multiple are found).
        // This approach works regardless of the operating system or way of starting the project.
        File file = new File(WorkingWithReaders.class.getClassLoader().getResource("input.txt").getFile());
        // The following approach relies on absolute paths and will locate the file only if it exists exactly at that
        // location and it's the same operating system.
//        File file = new File("d:/work/unibuc/pao_lab/lab6/src/main/resources/input.txt");
        try (FileInputStream fis = new FileInputStream(file);
             DataInputStream dis = new DataInputStream(fis);
             Scanner s = new Scanner(dis)) {
            int number;

            while (s.hasNextInt()) {
                number = s.nextInt();
                System.out.println(number);
            }
        }
    }

}
