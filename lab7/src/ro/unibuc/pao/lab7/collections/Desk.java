package ro.unibuc.pao.lab6.collections;

import java.util.Objects;

public class Desk {

    private int numarInventar;
    private int numarPicioare;
    private String nume;
    private int birou;

//    @Override
//    public int hashCode() {
//
//    }

    public int getNumarInventar() {
        return numarInventar;
    }

    public int getNumarPicioare() {
        return numarPicioare;
    }

    public void setNumarPicioare(int numarPicioare) {
        this.numarPicioare = numarPicioare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getBirou() {
        return birou;
    }

    public void setBirou(int birou) {
        this.birou = birou;
    }

    public void setNumarInventar(int numarInventar) {
        this.numarInventar = numarInventar;
    }

    @Override
    public boolean equals(Object o) {
        return nume == ((Desk) o).nume;
    }

    @Override
    public int hashCode() {
        return numarInventar;
    }
}
