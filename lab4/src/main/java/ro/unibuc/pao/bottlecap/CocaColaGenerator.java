package ro.unibuc.pao.bottlecap;

import java.util.Random;

/**
 * Generation rules: 20 alphanumeric characters; only uppercase letters or numbers from 1 to 9
 */
public class CocaColaGenerator extends Generator {

    private static final int LENGTH = 20;

    public int getLength() {
        return LENGTH;
    }

    @Override
    public String generateCode() {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < getLength(); i++) {
            if (new Random().nextBoolean()) {
                sb.append((char) ('1' + new Random().nextInt(9)));
            } else {
                sb.append((char) ('A' + new Random().nextInt(26)));
            }
        }

        return sb.toString();
    }
}
