import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class task3_3 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/Users/chassie/IdeaProjects/dzz1/src/task33.pages");
        Scanner scan = new Scanner(reader);
        int max = 0;
        String n = null;
        String ex = null;
         while (scan.hasNext())  { ex = scan.nextLine();
            if (ex.length()>max)  {
                max = ex.length();
                n = ex;
            }
        }
        System.out.println(n);
    }
}
