import java.util.Scanner;

/**
 * Created by Яна on 14.09.2016.
 * Имеется три стержня, на один из которых нанизаны N колец, причем кольца отличаются
 * размером и лежат меньшее на большем. Требуется перенести пирамиду из N колец с одного
 * стержня на другой за наименьшее число ходов. За один раз разрешается переносить только
 * одно кольцо, причём нельзя класть большее кольцо на меньшее.
 */
public class HomeTask10 {
    static int N; // Принцип расчета количества ходов: 2N − 1, где N — число дисков

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter any positive integer: ");
            N = in.nextInt();
        } while(N<1);

        int start = 1;   // первый стержень
        int temp = 2;    // временный стержень
        int end = 3;     // конечный стержень

        hanoi( N, start, end, temp);
    }

        public static void hanoi( int rings, int source, int destination,
        int temp ) {
            if ( rings == 1 )
            {
                System.out.printf( "\n%d -> %d", source, destination );
                return;
            }
            hanoi( rings - 1, source, temp, destination );

            System.out.printf( "\n %d -> %d", source, destination );

            hanoi( rings - 1, temp, destination, source );
        }
}
