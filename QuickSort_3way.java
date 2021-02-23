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
public class QuickSort_3way {

    private static int[] partition(long[] array, int low, int high) {
        long x = array[low];
        int m1 = low;
        int m2 = high;

        int i = low + 1;

        while (i <= m2) {
            if (array[i] > x) {
                swap(array, i, m2);
                m2--;
            } else if (array[i] < x) {
                swap(array, m1, i);
                m1++;
                i++;
            } else {
                i++;
            }
        }
        int[] m = {m1, m2};
        return m;
    }

    public static void Quicksort_3Way(long[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int k = low;
        long t = array[low];
        array[low] = array[k];
        array[k] = t;
        int m[] = partition(array, low, high);
        Quicksort_3Way(array, low, m[0] - 1);
        Quicksort_3Way(array, m[1] + 1, high);
    }

    private static void swap(long[] a, int i, int j) {
        long temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

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
        long[] array = new long[10];
        Random rnd = new Random();
        for (int i = 0; i < 1; i++) {
            rnd.setSeed(i * 15);
            for (int j = 0; j < array.length; j++) {
                array[j] = rnd.nextInt(100);
            }

            //reverse(array);
            long starttime = System.currentTimeMillis();
            Quicksort_3Way(array, 0, array.length - 1);
            long endtime = System.currentTimeMillis();
            System.out.println((endtime - starttime));

        }
    }
}
