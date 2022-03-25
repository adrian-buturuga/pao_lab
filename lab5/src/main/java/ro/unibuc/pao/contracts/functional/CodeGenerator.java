package ro.unibuc.pao.contracts.functional;

import java.util.Random;

/**
 * Implementation of the Generator interface, to show how such an implementation was used before lambdas.
 */
public class CodeGenerator implements Generator {

    @Override
    public String generate(int length) {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i=0; i<length; i++) {
            sb = sb.append((char)('A'+r.nextInt(20)));
        }
        return sb.toString();
    }
}
