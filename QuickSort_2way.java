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
public class QuickSort_2way {

    public static void quickSort(long[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        long pivot = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }
    }

    public static void swap(long array[], int x, int y) {
        long temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void main(String[] args) {
        long[] array = new long[4000000];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        long begintime = System.currentTimeMillis();
        quickSort(array, 0, array.length - 1);
        long endtime = System.currentTimeMillis();
        System.out.println("süre= " + (endtime - begintime));

    }

}
