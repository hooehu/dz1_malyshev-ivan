import java.util.Scanner;


public class task2_3 {
    public static void main(String[] args) throws ExceptionNotInt {
        System.out.println("Введите строку и нажмите Enter, затем введите целое положительное число:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number> 0) {
                for (int i = 0; i < number; i++) {
                    System.out.println(text);
                }
            } } else {
            throw new ExceptionNotInt("Ошибка( Введите целое число");
        }}
    public static class ExceptionNotInt extends Exception{
        public ExceptionNotInt(String message) {
            super(message);
        }
    }}
