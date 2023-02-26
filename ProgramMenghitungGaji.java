import java.util.Scanner;

public class PerusahaanA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input gaji pokok
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = scanner.nextDouble();

        // Input jam lembur
        System.out.print("Masukkan jam lembur: ");
        int jamLembur = scanner.nextInt();

        // Input upah lembur
        System.out.print("Masukkan upah lembur per jam: ");
        double upahLembur = scanner.nextDouble();

        // Hitung gaji total dengan lembur
        double gajiTotal = gajiPokok + (jamLembur * upahLembur);

        // Output gaji total dengan lembur
        System.out.println("Gaji total dengan lembur adalah: " + gajiTotal);
    }
}
