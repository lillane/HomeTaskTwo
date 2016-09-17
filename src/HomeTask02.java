/**
 * Created by Яна on 07.09.2016.
 * Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
 * первый и второй члены последовательности равны единицам, а каждый следующий — сумме
 * двух предыдущих.
 */
public class HomeTask02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        int n = 11;
        int sum;
        for (int i=2; i<n; i++){
            sum = a+b;
            a = b;
            b = sum;
            System.out.println(sum);
        }

    }
}
