package ro.unibuc.pao.lab5.io;

import java.io.*;
import java.util.Scanner;

public class WorkingWithReaders {

    private static void write() {

    }

    public static void main(String args[]) throws IOException {





        try (FileInputStream fis = new FileInputStream("d:/someFile.in");
             DataInputStream dis = new DataInputStream(fis);
             Scanner s = new Scanner(fis)) {
            int number;
            while (s.hasNextInt()) {
                number = s.nextInt();
                System.out.println(number);
                throw new RuntimeException("something");
            }
        } catch (RuntimeException | IOException e) {
            // nope, it's sunny
            System.out.println(e.getClass().getCanonicalName());
        }
        finally {
            System.out.println("I'm done");
        }
    }

}
