import java.util.Scanner;

public class HitungLembarUangKertas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nominal
        System.out.print("Masukkan nominal: ");
        int nominal = scanner.nextInt();

        // Hitung lembar uang kertas
        int lembar50 = nominal / 50000;
        int sisa50 = nominal % 50000;
        int lembar20 = sisa50 / 20000;
        int sisa20 = sisa50 % 20000;
        int lembar5 = sisa20 / 5000;
        int sisa5 = sisa20 % 5000;
        int lembar2 = sisa5 / 2000;
        int sisa2 = sisa5 % 2000;
        int keping500 = sisa2 / 500;

        // Output lembar uang kertas
        System.out.println(lembar50 + " lembar 50ribuan");
        System.out.println(lembar20 + " lembar 20ribuan");
        System.out.println(lembar5 + " lembar 5ribuan");
        System.out.println(lembar2 + " lembar 2ribuan");
        System.out.println(keping500 + " keping 500an");
    }
}
