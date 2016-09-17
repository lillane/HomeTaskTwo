import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Яна on 14.09.2016.
 * Создайте код, который выводит все простые числа из интервала от 2 до n (заданного с клавиатуры).
 * Результат должен быть: 2,3,5,7 ...
 */
public class HomeTask09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int i, j;
        List Numbers = new ArrayList();

        do {
            System.out.println(" ");
            n = in.nextInt();
        } while(n<=2);

        for(i=2; i<=n; i++){
            boolean isPrime = true;
            for(j=2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }

    }


}
