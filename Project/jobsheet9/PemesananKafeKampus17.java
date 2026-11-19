package jobsheet9;

import java.util.Scanner;

public class PemesananKafeKampus17 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===== DAFTAR MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }
        System.out.println();

        // Fitur pencarian menu (linear search)
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cari = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu " + menu[i] + " tersedia dengan harga Rp" + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Menu " + cari + " tidak tersedia.");
        }
        System.out.println();

        // Fitur pemesanan
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < pesanan.length; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Pesanan ke-" + (i + 1) + ": ");
                String namaMenu = input.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaMenu)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        total += harga[j];
                        valid = true;
                        break;
                    }
                }
                if (!valid) {
                    System.out.println("Menu tidak tersedia, silakan masukkan ulang.");
                }
            }
        }

        // Tampilkan daftar pesanan dan total biaya
        System.out.println();
        System.out.println("===== DAFTAR PESANAN =====");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("--------------------------");
        System.out.println("Total biaya: Rp" + total);
    }
}