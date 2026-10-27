import java.util.Scanner;
public class Tugas1_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, hargaTiket = 50000, totalTiket=0, totalHarga=0;


        System.out.println("Penjualan Tiket Bioskop");
        System.out.println("(ketik 0 untuk mengakhiri penjualan hari ini)");

        do {
            System.out.println("Jumlah tiket yang dibeli: ");
            jumlahTiket= sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan input ulang!");
                continue;   
            }
            if (jumlahTiket == 0) {
               break;
            }
            double harga = jumlahTiket *hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0.0;
            }

            double bayar = hargaTiket*jumlahTiket - (hargaTiket * diskon);

            System.out.println("Diskon: " + (diskon * 100) +"%");
            System.out.println("Total bayar: Rp " + bayar);

            totalTiket += jumlahTiket;
            totalHarga += bayar;
     } while (true);

     System.out.println("Penjualan pada hari ini");
     System.out.println("Total tiket terjual: " + totalTiket);
     System.out.println("Total penjualan: " + totalHarga);

     sc.close();
    }
}
