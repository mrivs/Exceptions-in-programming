package homework01;

import java.util.Arrays;

/*/
    2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/
public class Task02 {
    public static void main(String[] args) {
        int[] a = { 2, 0, 2 };
        int[] b = { -2, 0, -2, 0 };
        System.out.println(Arrays.toString(diffArr(a, b)));

    }

    public static int[] diffArr(int[] arr_a, int[] arr_b) {
        if (arr_a == null || arr_b == null) {
            System.out.println("Нулевой массив!");
            return null;
        }
        if (arr_a.length != arr_b.length) {

            System.out.println("Разная длинна массивов!");
            return null;
            // throw new RuntimeException("Разная длинна массивов!");
        }
        int[] arr_res = new int[arr_a.length];
        for (int i = 0; i < arr_a.length; i++) {
            arr_res[i] = arr_a[i] - arr_b[i];
        }
        return arr_res;
    }
}
