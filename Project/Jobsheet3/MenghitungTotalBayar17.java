package Jobsheet3;

import java.util.Scanner;

public class MenghitungTotalBayar17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double harga, potongan, jumlahBayar, diskon = 0.15;

        System.out.println("Masukkan harga barang = Rp.");
        harga=sc.nextDouble();

        potongan=diskon*harga;
        jumlahBayar=harga-potongan;

        System.out.println("Jumlah yang harus dibayar Rp. " +jumlahBayar);
        sc.close();
    }
}
