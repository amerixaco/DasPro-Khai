package jobsheet9;

import java.util.Scanner;

public class ArrayNilai17 {
     public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
 
        // Input nilai (tidak bisa memakai foreach, lihat jawaban Pertanyaan 3)
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
 
        // Pertanyaan 2: hanya tampilkan yang LULUS
        System.out.println("\n=== Mahasiswa yang LULUS (nilai > 70) ===");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
            }
        }
 
        // Pertanyaan 3: versi foreach untuk menampilkan (memakai penghitung manual "no")
        System.out.println("\n=== Semua mahasiswa (foreach) ===");
        int no = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
            no++;
            
            // Pertanyaan 4: hitung jumlah lulus & tidak lulus
            if (nilai > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
 
        // Pertanyaan 4: tampilkan rekap
        System.out.println("\nJumlah mahasiswa lulus       : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);
        }
    }

