import java.util.Scanner;

/**
 * Created by Яна on 07.09.2016.
 * Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его
 * цифр (заранее не известно сколько цифр будет в числе).
 */


public class HomeTask01b {
    static long N;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter any positive integer: ");
            N = in.nextLong();
        } while (N <= 0);

        long sum = 0;

        while ((N%10) > 0) {
            sum = sum + N%10;
            N = N/10;
        }
        System.out.println("The sum of digits of your number is: " + sum);
    }
}
