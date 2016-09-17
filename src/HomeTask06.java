import java.util.Arrays;

/**
 * Created by Яна on 14.09.2016.
 * Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
 * Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
 * Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
public class HomeTask06 {
    public static void main(String[] args) {
        int myArray[][] = new int[7][4];
        int i;
        int j;
        for(i = 0; i<7; i++){
            for (j=0; j<4; j++){
                myArray[i][j] = 0;
                myArray[i][j] = (int)(Math.random()*11-5) ;
                /* функция Random возвращает значения от 0 до 1, поэтому чтоб расширить отрезок от -5 до 5
                 произведены арифметические операции согласно min и max значений
                */
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

        int n1 = Math.abs(myArray[0][0]*myArray[0][1]*myArray[0][2]*myArray[0][3]);

        int index = 0;

        for(i=1; i<myArray.length; i++){
            int numberString = Math.abs(myArray[i][0]*myArray[i][1]*myArray[i][2]*myArray[i][3]);
            if (n1<numberString){
                n1 = numberString;
                index = i;
            }
        }
        System.out.println("Индекс строки в массиве с наибольшем произведением элементов:" + index);



    }
}
