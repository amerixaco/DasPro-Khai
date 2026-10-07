package Jobsheet3;

import java.util.Scanner;

public class Tugas01_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaLaptop, uangMuka, lamaMencicil;
        double bunga = 0.02, cicilan, sisa, bungaCicilan;

        System.out.println("Masukkan harga laptop: Rp. ");
        hargaLaptop = sc.nextInt();
        System.out.println("Masukkan uang muka: Rp. ");
        uangMuka = sc.nextInt();
        System.out.println("Masukkan lama mencicil (bulan): ");
        lamaMencicil = sc.nextInt();

        sisa = hargaLaptop - uangMuka;
        bungaCicilan = sisa * bunga;
        cicilan = (sisa + (bungaCicilan * lamaMencicil)) / lamaMencicil;

        System.out.println("Cicilan yang harus dibayar setiap bulan adalah Rp. " + cicilan);
        sc.close();
    }   
}
