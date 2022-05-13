# Exercises

## Exercise 1

<details>
<summary>Expand</summary>

Ce va afisa programul urmator? 

a) 4

b) 3

c) 2

d) 1

```java
class Automobil {
    private String marca;

    public Automobil(String marca) {
        this.marca = marca;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(Object obj) {
        return true;
    }
}

public class Test1 {
    public static void main(String[] args) {
        HashSet<Automobil> la = new HashSet<>();
        la.add(new Automobil("Audi"));
        la.add(new Automobil("BMW"));
        la.add(new Automobil("Audi"));
        la.add(new Automobil("Open"));
        System.out.println(la.size());
    }

}
```
</details>

## Exercise 2

<details>
<summary>Expand</summary>
Precizati care dintre urmatoarele afirmatii este adevarata pentru clasele imutabile:

a) sunt implicit si clase de tip singleton

b) au toate datele membre de tip final

c) au un singur constructor, fara parametri

d) referintele spre instantele lor nu pot fi modificate

</details>

## Exercise 3

<details>
<summary>Expand</summary>
Precizati care dintre urmatoarele afirmatii este adevarata pentru programul dat:

a) exista erori de compilare in clasa Test
 
b) exista erori de compilare in clasa B
 
c) va afisa `BPBQR` dupa rulare
 
d) va afisa `APBQR` dupa rulare

```java
class A {
    public static void metoda(String s) { System.out.println("A"+s); }
}

class B extends A {
    public static void metoda(String s) { System.out.print("B"+s);}
    public void metoda (String s, String t) { System.out.print("B"+s+t);}
}

public class Test2 {

    public static void main(String[] args) {
        A ob = new B();
        ob.metoda("P");
        ob.metoda("Q", "R");
    }

}
```

</details>

## Exercise 4

<details>
<summary>Expand</summary>

De cate ori va fi afisat textul `Constructor`, dupa executarea programului dat?
 
a) niciodata
 
b) o data
 
c) de doua ori
 
d) de trei ori

```java

class Persoana implements Serializable {
    String nume;
    int varsta;
    
    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        System.out.println("Constructor");
    }
}

public class Test3 {
    
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persoana.ser"));
        Persoana p = new Persoana("Popescu Ion", 40), q = p;
        oos.writeObject(q);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persoana.ser"));
        Persoana r = (Persoana) ois.readObject();
        ois.close();
    }
    
}
```
</details>

## Exercise 5

<details>
<summary>Expand</summary>

Dupa executarea programului, se va afisa:

a) `ABCDE`
 
b) `ABDE`
 
c) `ABDEC`
 
d) `ABCD`

```java
public class Test4 {
    static String sir = "A";

    void A() {
        try {
            sir = sir + "B";
            B();
        } catch (Exception e) { sir = sir + "C"; }
    }

    void B() throws Exception {
        try {
            sir = sir + "D";
            C();
        }
        catch (Exception e) { throw new Exception(); }
        finally { sir = sir + "E"; }
    }
    
    void C() throws Exception{ throw new Exception(); }
    
    public static void main(String[] args) {
        Test4 ob = new Test4();
        ob.A();
        System.out.println(sir);
    }
}
```
</details>

## Exercise 6

<details>
<summary>Expand</summary>

Scrieti o clasa Java care sa determine toate cuvintele de lungime `n` >= 1 dintr-un fisier text, folosind un fir de 
executare. Scrieti un program care citeste de la tastatura un numar natural `n` si, utilizand clasa definita anterior, 
afiseaza toate cuvintele distincte de lungime `n` din fisierele test `poezie_1.txt` si `poezie_2.txt`. Cuvintele din 
fisierele text de intrare sunt despartite intre ele prin spatii si semnele de punctuatie uzuale.

</details>

## Exercise 7 

<details>
<summary>Expand</summary>

Consideram definia clasa `DiplomaLicenta` cu datele membre `serie`, `absolvent`, `an`, `facultate`, `specializare` si 
`medie`. Clasa incapsuleaza constructori, metode de tip `set`/`get` pentru toate datele membre, precum si metodele
`toString()`, `equals()` si `hashCode()`. Creati o lista care sa contina cel putin 3 obiecte de tip `DiplomaLicenta`
si, folosind stream-uri bazate pe lista creata si lamdba expresii, rezolvati urmatoarele cerinte:

- afisati diplomele eliberate intre anii `2000` si `2010`, in ordinea descrescatoare a mediilor
- afisati specializarile distincte pentru care au fost eliberate diplome in `Facultatea de Informatica` in anul `2018`
- creati o lista formata din numele absolventilor care au obtinut media `10`
- afisati numarul diplomelor eliberate pentru specializarea `Informatica`

</details>

## Exercise 8

<details>
<summary>Expand</summary>

Se considera baza de date `Diplome`, avand urmatorul URL: `jdbc:derby://localhost:1527/Diplome`. Baza de date contine
tabela `DiplomeLicenta`, avand campurile `serie`, `absolvent`, `an`, `facultate`, `specializare` si `medie`. Scrieti 
un program care sa citeasca de la tastatura doua valori intregi `an_min` si `an_max`, precum si denumirea `den_spec`
a unei specializari, dupa care creeaza o lista cu informatii despre diplomele eliberate intre anii `an_min` si `an_max`
pentru specializarea `den_spec`. Elementele listei vor fi obiecte de tipul clasei `DiplomaLicenta` definita anterior
(vom considera faptul ca aceasta implementeaza interfata `Serializable`). Daca lista obtinuta nu este vida, aceasta va 
fi serializata in fisierul `diplome.dat`, altfel se va afisa pe ecran un mesaj corespunzator. 

</details>