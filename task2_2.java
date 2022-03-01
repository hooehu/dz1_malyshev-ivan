import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        if (text.equals("hello"))  {
            System.out.println("Hello, ");
            for (String str : args) System.out.println(str + " ");
        }
    }
}
