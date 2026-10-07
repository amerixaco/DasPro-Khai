package Jobsheet3;

import java.util.Scanner;

public class GajiKaryawan17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok;
        double bonus, totalGaji;
        double tunjanganTransportasi=600000;
        double tunjanganMakan=400000;

        System.out.println("Masukkan gaji pokok");
        gajiPokok=sc.nextInt();

        bonus= 0.5*gajiPokok;
        totalGaji=gajiPokok+tunjanganTransportasi+tunjanganMakan+bonus-(0.1*gajiPokok);

        System.out.println("Bonus Bulanan anda adalah Rp. "+bonus);
        System.out.println("Gaji yang diterima adalah Rp. "+ (int) totalGaji);

        sc.close();
    }
}
