import java.util.Scanner;
public class Tugas311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1.");
            }
        } while (jumlahToko < 1);
        int totalBarangSemua = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;
        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("Toko " + i);
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println(
                        "Jumlah pelanggan tidak boleh negatif."
                    );
                }
            } while (jumlahPelanggan < 0);
            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;
                do {
                    System.out.print(
                        "Jumlah barang pelanggan " + j + ": "
                    );
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println(
                            "Jumlah barang tidak boleh negatif."
                        );
                    }
                } while (jumlahBarang < 0);
                totalBarangToko += jumlahBarang;
            }
            System.out.println(
                "Toko " + i + " - pelanggan: " + jumlahPelanggan
                + ", total barang: " + totalBarangToko
            );
            totalBarangSemua += totalBarangToko;
            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println(
            "Total barang seluruh toko: " + totalBarangSemua
        );
        System.out.println(
            "Toko dengan barang terbanyak: " + tokoTerbanyak
        );
        sc.close();
    }
}