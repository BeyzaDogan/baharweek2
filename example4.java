/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
import java.util.Random;
import java.util.Scanner;

public class example4 {

    /**
     * @param args the command line arguments
     */
    long start = System.currentTimeMillis();

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] array = new int[1000];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1000);

        }
        System.out.println("sıralama öncesi:");
        printarray(array);
        int[] sorted = insertionsort(array);
        System.out.println("sıralama sonrası:");
        printarray(sorted);

    }

    public static int[] insertionsort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int var = array[i];
            int j = i - 1;
            while (j > -1 && array[j] > var) {
                array[j + 1] = array[j];
                j--;
                array[j + 1] = var;
            }
        }

        return array;
    }

    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    long elapsedTimeMillis = System.currentTimeMillis() - start;

}
