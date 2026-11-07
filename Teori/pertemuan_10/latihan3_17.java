package Teori.pertemuan_10;

public class latihan3_17 {
    public static void main(String[] args) {

        for (int n = 1; n <= 5; n++) {
            int jumlah = 0;
            String teks = "";
 
            for (int i = 1; i <= n; i++) {
                int kuadrat = i* i;
                jumlah = jumlah + kuadrat;

                if (i == 1) {
                    teks = teks + kuadrat;
                } else {
                    teks = teks + " + " + kuadrat;
                }
            }
 
            System.out.println("n = " + n + " -> jumlah kuadrat = " + teks + " = " + jumlah);
        }
    }
}
 