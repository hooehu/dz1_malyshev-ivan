import java.io.*;
import java.util.Stack;

public class task1_1 {

    public static void main(String[] args) throws IOException {
        Stack stack = new Stack(); //создание пустого стека
        File file = new File("/Users/chassie/IdeaProjects/dzz1/src/task11.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            if (line.contains("0") && line.length() == 1) {
                break;
            }
            stack.push(line);
            line = reader.readLine();
        }

        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        while (stack.size() != 0){
            String str = (String) stack.pop();
            writer.println(str);
        }}
}

