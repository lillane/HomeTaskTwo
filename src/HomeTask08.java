import java.util.Scanner;

/**
 * Created by Яна on 14.09.2016.
 * Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент последовательности Фибоначчи
 * для вычисления пятнадцатого элемента.
 */
public class HomeTask08 {
    static int i = 0;
    public static void main(String[] args) {

        int n = 15;
        // Формула Фибоначи: Fn= Fn-1+Fn-2.
        fib(n);
        System.out.println(i);
    }

    public static int fib (int n){
        if(n==4){
           i=i+1;
        }
        if(n<2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
