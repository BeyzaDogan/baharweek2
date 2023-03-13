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

public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] arr = new int[1000];
        Random random = new Random();

        // Diziyi rastgele sayılarla doldur
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
            System.out.print("sıralama öncesi:");
        System.out.print(arr[i]);
            System.out.println();
        }
        // Diziyi sırala
        combsort(arr);

        // Sıralanmış diziyi ekrana yazdır
        System.out.println("sıralama sonrası:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void combsort(int[] arr) {
    int n = arr.length;
    int gap = n;
    double shrink = 1.3;
    boolean sorted = false;
    
    while (!sorted) {
        gap = (int) (gap / shrink);
        if (gap <= 1) {
            gap = 1;
            sorted = true;
        }
        
        int i = 0;
        while (i + gap < n) {
            if (arr[i] > arr[i+gap]) {
                int temp = arr[i];
                arr[i] = arr[i+gap];
                arr[i+gap] = temp;
                sorted = false;
            }
            i++;
        }
    }
}

}


    

