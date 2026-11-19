package jobsheet8;

import java.util.Scanner;

public class star17 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
 
        for (int i = 1; i <= n; i+=2) {        // outer loop: baris
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
