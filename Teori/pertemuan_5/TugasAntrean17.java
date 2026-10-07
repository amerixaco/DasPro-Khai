package Teori.pertemuan_5;

import java.util.Scanner;

public class TugasAntrean17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int layanan;
        System.out.println("Pilih layanan :");
        layanan = sc.nextInt();
        
        switch (layanan) {
            case 1:
                System.out.println("Layanan legalisir ijazah di Loket A");
                break;
            case 2:
                System.out.println("Layanan Keterangan Aktif Kuliah di Loket B");
                break;
            case 3:
                System.out.println("Layanan Pembayaran UKT di Loket C");
                break;
            case 4 :
                System.out.println("Layanan Pengajuan Cuti Akademik di Loket D");
                break;    
            default:
                System.out.println("Layanan tidak tersedia");
                break;
        }
    }
}