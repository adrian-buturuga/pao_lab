package ro.unibuc.pao.exercise;

/**
 * Let a self describing file be a file where the first char on each line is a digit, specifying the type of data that
 * follows. After the type, the rest of the line represents the value, represented in that type.
 * <p>
 * Complete the class below so that it can correctly process such a file and return the values as a single string, each
 * value separated by space. If the value cannot be cast to said type, a custom checked exception should be thrown,
 * indicating the offending line in the file.
 * <p>
 * 1 = int
 * 2 = byte
 * 3 = boolean
 * 4 = String
 */
public class ReadSelfDescribingFile {

    public ReadSelfDescribingFile(String filename) {

    }

    public String read() {
        throw new RuntimeException("not implemented yet");
    }

    public static void main(String[] args) {
        ReadSelfDescribingFile processor = new ReadSelfDescribingFile("exercise");
        if ("1 Little piggy went 2 the true market".equals(processor.read())) {
            System.out.println("Corect");
        } else {
            System.out.println("mai incearca");
        }
    }

}
