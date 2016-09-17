import java.util.Scanner;

/**
 * Created by Яна on 14.09.2016.
 * Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n;
 */
public class HomeTask07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter any positive integer: ");
            n = in.nextInt();
        } while(n<1);

        System.out.println(calc(n));
    }

    public static int calc (int n){
        if(n>=1) {
            return n + calc(n - 1);
        }
        return 0;
    }
}
