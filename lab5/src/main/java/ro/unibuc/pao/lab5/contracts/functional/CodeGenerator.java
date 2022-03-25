package ro.unibuc.pao.lab5.contracts.functional;

import java.util.Random;

public class CodeGenerator implements Generator {

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i=0; i<10; i++) {
            sb = sb.append((char)('A'+r.nextInt(20)));
        }
        return sb.toString();
    }
}
