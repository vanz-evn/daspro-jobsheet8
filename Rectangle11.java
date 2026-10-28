import java.util.Scanner;
public class Rectangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {      // 0uter loop: baris
            for (int j = 1; j <= kolom; j++) {  // Inner loop: kolom
                System.out.print("#");
            }
            System.out.println();               // Pindah baris
        }
        sc.close();
    }
}