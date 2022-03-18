package ro.unibuc.pao.bottlecap;

import java.util.Random;

/**
 * Generation rules: 8 digits.
 */
public class PepsiGenerator extends Generator {

    private static final int LENGTH = 8;

    public int getLength() {
        return LENGTH;
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getLength(); i++) {
            sb.append((char) ('0' + new Random().nextInt(10)));
        }
        return sb.toString();
    }
}
