package homework01;

import java.util.Arrays;

/*/
3. (Дополнительно) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
/*/
public class Task03 {
    public static void main(String[] args) {

        int[] a = { 2, 0, 6, 8 };
        int[] b = { 1, 1, 4, 10 };

        System.out.println(Arrays.toString(divArr(a, b)));

    }

    public static float[] divArr(int[] arr_a, int[] arr_b) {

        if (arr_a == null || arr_b == null) {
            throw new RuntimeException("Нулевой массив!");
        }

        if (arr_a.length != arr_b.length) {
            throw new RuntimeException("Разная длинна массивов!");
        }

        float[] arr_res = new float[arr_a.length];
        for (int i = 0; i < arr_a.length; i++) {
            if (arr_b[i] == 0) {
                throw new RuntimeException("Деление на ноль!");
            }
            arr_res[i] = arr_a[i] / arr_b[i];
        }
        return arr_res;
    }

}
