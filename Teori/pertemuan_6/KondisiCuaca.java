package Teori.pertemuan_6;

import java.util.Scanner;

public class KondisiCuaca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Suhu (derajat C) : ");
        double suhu = in.nextDouble();
        System.out.print("Apakah hujan? (ya/tidak) : ");
        String hujan = in.next();

        if (suhu > 27) {
            System.out.println("Disarankan memakai dress");
            if (hujan.equalsIgnoreCase("ya")) {
                System.out.println("Disarankan membawa payung");
            } else {
                System.out.println("Disarankan memakai sunscreen");
            }
        } else {
            System.out.println("Disarankan memakai celana panjang");
        }

        in.close();
    }
}
