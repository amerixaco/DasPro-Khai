package Teori.pertemuan_10;

import java. util.Scanner;

public class StudiKasus3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int totalSemua = 0;      // totalSemua diinisialisasi sekali, sebelum outer loop
       for (int p = 1; p <= 3; p++) {      //Outer loop: mengulang proses untuk setiap produk (p = 1 sd 3)
          System.out.println("produk " + p);
          int totalProduk = 0;      //totalProduk di reset ke 0 setiap ganti produk
          for (int h = 1; h <= 4; h++) {     // inner loop: membaca penjualan hari 1 sd 4 dan menjumlahkannya
                System.out.print("hari" + h + ": ");
                int jumlah = sc.nextInt();
                totalProduk += jumlah;
          }
            System.out.println("total produk " + p + " = " + totalProduk);
            totalSemua += totalProduk;     // total satu produk ditambahkan ke totalSemua
       }
       System.out.println("total semua produk = " + totalSemua);

    }
}
