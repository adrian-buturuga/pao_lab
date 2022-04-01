package ro.unibuc.pao.io;

import java.io.*;
import java.util.Scanner;

public class WorkingWithReaders {

    private static void write() {

    }

    public static void main(String args[]) throws IOException {

        try (FileInputStream fis = new FileInputStream("d:/work/unibuc/pao_lab/lab6/src/main/resources/input.txt");
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
            System.out.println(e.getClass().getName());
        }
        finally {
            System.out.println("I'm done");
        }
    }

}
