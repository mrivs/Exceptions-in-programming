package homework01;

/*/
1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
/*/

public class Task01 {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2 };

        System.out.println(div(5, 0));              // ArithmeticException
        System.out.println(parseInt("O"));          // NumberFormatException
        System.out.println(getElement(arr, 5));   // ArrayIndexOutOfBoundsException

    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    public static int getElement(int[] array, int index) {
        return array[index];
    }

}