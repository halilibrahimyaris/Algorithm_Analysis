/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Project;

import java.util.Random;

/**
 *
 * @author halil
 */
public class Test {

    public static void reverse(long[] input) {
        int last = input.length - 1;
        int middle = input.length / 2;
        for (int i = 0; i <= middle; i++) {
            long temp = input[i];
            input[i] = input[last - i];
            input[last - i] = temp;
        }
    }

    public static void main(String[] args) {
        int size = 32000000;
        long[] array = new long[size];
        long[] array2 = new long[size];

        int x;
        Random rnd = new Random();
        for (int i = 0; i <= 10; i++) {
            rnd.setSeed(i * 15);
            for (int j = 0; j < array.length; j++) {
                array[j] = rnd.nextInt(100);
                array2[j] = rnd.nextInt(100);
            }
            //reverse(array);
            long starttime = System.currentTimeMillis();
            QuickSort_2way.quickSort(array, 0, array.length - 1);
            long endtime = System.currentTimeMillis();
            /*  //reverse(array2); */
            long starttime2 = System.currentTimeMillis();
            QuickSort_3way.Quicksort_3Way(array2, 0, array2.length - 1);
            long endtime2 = System.currentTimeMillis();

            System.out.print("\n\n");

            System.out.println(i + ". iterasyon");
            System.out.println("2 time: " + ((endtime - starttime)));
            System.out.println("3 time: " + ((endtime2 - starttime2)));
            System.out.println("--------------------------");
        }
    }

}
