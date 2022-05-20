package ro.unibuc.pao.sample1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Scrieti o clasa Java care sa determine toate cuvintele de lungime n >= 1 dintr-un fisier text, folosind un fir de executie.
 * Scrieti un program care citeste de la tastatura un numar natural n si, utilizand clasa definita anterior, afiseaza toate
 * cuvintele distincte de lungime n din fisierele test poezie_1.txt si poezie_2.txt. Cuvintele din fisierele text de intrare
 * sunt despartite intre ele prin spatii si semnele de punctuatie uzuale.
 */
public class Poezie {

    public static void main(String[] args) throws InterruptedException {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        PoetryReader poetryReader1 = new PoetryReader(n, "D:\\poezie_1.txt");
        PoetryReader poetryReader2 = new PoetryReader(n, "D:\\poezie_2.txt");
        poetryReader1.start();
        poetryReader2.start();
        poetryReader1.join();
        poetryReader2.join();
        TreeSet<String> distinctWords = new TreeSet<>();
        distinctWords.addAll(poetryReader1.getFoundWords());
        distinctWords.addAll(poetryReader2.getFoundWords());
        for (String s : distinctWords) {
            System.out.println(s);
        }
    }

}

class PoetryReader extends Thread {

    private int n;
    private String file;
    private ArrayList<String> found = new ArrayList<>();

    public PoetryReader(int n, String file) {
        this.n = n;
        this.file = file;
    }

    @Override
    public void run() {
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            String line;
            while ((line = dis.readLine()) != null) {
                String[] words = line.split("[ .?!]");
                for (String word : words) {
                    if (word.length() == n) {
                        found.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getFoundWords() {
        return found;
    }

}