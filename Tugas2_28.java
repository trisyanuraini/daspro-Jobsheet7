import java.util.Scanner;
public class Tugas2_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("Jenis kendaraan (1:mobil, 2:motor, 0:keluar)");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.println("Durasi parkir (jam): ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
        sc.close();
    }
}