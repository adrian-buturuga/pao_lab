package ro.unibuc.pao.lap.serialization;

import java.io.Serializable;

public class Modifying extends NonSerializable implements Serializable {

    private static final long serialVersionUID = 4;

    int b;
    static double d;
    transient String s;
    long t;

    public void show()
    {
        System.out.println(b);
    }
}
