import java.util.Scanner;

/**
 * Created by Яна on 07.09.2016.
 * Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его
 * цифр (заранее не известно сколько цифр будет в числе).
 */


public class HomeTask01a {
    static long N;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter any positive integer: ");
            N = in.nextLong();
        } while (N <= 0);

        String numberString = String.valueOf(N);
        char[] CharArray = numberString.toCharArray();

        int i;
        int sum = 0;

        for (i = 0; i < CharArray.length; i++) {
            sum = sum + Integer.valueOf(String.valueOf(CharArray[i]));
        }
        System.out.println("The sum of digits of your number is: " + sum);
    }
}

