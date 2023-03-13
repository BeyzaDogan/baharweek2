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

public class example5 {

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
            array[i] = r.nextInt(1001);

        }
        System.out.println("sıralama öncesi:");
        printarrayy(array);
        int[] sorted = combsort(array);
        System.out.println("sıralama sonrası:");
        printarrayy(sorted);

    }

    public static int[] combsort(int[] array) {
        int n = array.length;
        int gap = n;
        boolean degisim = true;
        while (gap != 1 || degisim) {
            gap = getnextGap(gap);
        
        degisim = false;

        for (int i = 0; i < n - gap; i++) {
            if (array[i] > array[i + gap]) {
                int temp = array[i];
                array[i] = array[i + gap];
                array[i + gap] = temp;
                degisim = true;
            }
        }}

        return array;
    }

    public static int getnextGap(int gap) {
        gap = (gap * 10) / 13;
        if (gap <= 1) {
            return 1;
        }
        return gap;
    }

    public static void printarrayy(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    long elapsedTimeMillis = System.currentTimeMillis() - start;

}

