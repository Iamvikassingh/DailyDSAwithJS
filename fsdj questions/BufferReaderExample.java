import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
    public static void main(String... arg) throws IOException , NumberFormatException {
        System.out.println("Enter the number");

        try(BufferedReader bf = new BufferedReader( new InputStreamReader(System.in))) {
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        } finally {
            AutoCloseable bf;
        }
    }
}
