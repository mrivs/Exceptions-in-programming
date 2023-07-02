package homework02;

import java.util.Scanner;

/*/
4.  Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
/*/
public class Task04h2 {
    public static void main(String[] args) {
        String str = null;

        try {
            str = inputString();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Введеная строка была: " + str);
        }
    }

    public static String inputString() throws Exception {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            scanner.close();
            throw new Exception("Пустые строки вводить нельзя !");
        }

        scanner.close();
        return input;
    }

}
