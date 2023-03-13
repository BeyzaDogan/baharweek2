/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
import java.util.Scanner;
import java.util.Random;

public class example2 {

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
        System.out.println("sorting öncesi:");
        printarray(array);
        int[] sorted = selectionsort(array);
        System.out.println("sorting sonrası:");
        printarray(sorted);

    }

    public static int[] selectionsort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

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
