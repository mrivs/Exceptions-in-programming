package homework02;
/*/
1.  Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
/*/

import java.util.Scanner;

public class Task01h2 {
    public static void main(String[] args) {
        
        float number = inputFloat();
        System.out.println("Введенное число: " + number);

    }

    public static float inputFloat() {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                float number = scanner.nextFloat();
                scanner.close();
                return number;
            } catch (Exception e) {
                System.out.print("Некорректный ввод. Введите число (float) : ");
                scanner.nextLine();
            }
            
        }
       
    }
}
