package Teori.pertemuan_10;

public class latihan2abc_17 {
    public static void main(String[] args) {
        char huruf = 'a';
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(huruf + " ");
                huruf++;
            }
            System.out.println();
        }
    }
}