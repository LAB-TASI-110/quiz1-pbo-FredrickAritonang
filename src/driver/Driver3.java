import java.time.LocalDate;
import java.util.Scanner;

public class Driver3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String namaPelanggan;
        String jenisLayanan = "";
        double berat;
        double hargaPerKg = 0;
        double total;
        int pilihan;

        System.out.println("===== SISTEM LAUNDRY DEL =====");

        System.out.print("Masukkan Nama Pelanggan: ");
        namaPelanggan = input.nextLine();

        System.out.println("\nPilih Jenis Layanan:");
        System.out.println("1. Cuci Kering (7000/kg) - 2 Hari");
        System.out.println("2. Cuci + Setrika (10000/kg) - 2 Hari");
        System.out.println("3. Express (15000/kg) - 1 Hari");
        System.out.print("Masukkan pilihan (1-3): ");
        pilihan = input.nextInt();

        int estimasiHari = 0;

        if (pilihan == 1) {
            jenisLayanan = "Cuci Kering";
            hargaPerKg = 7000;
            estimasiHari = 2;
        } else if (pilihan == 2) {
            jenisLayanan = "Cuci + Setrika";
            hargaPerKg = 10000;
            estimasiHari = 2;
        } else if (pilihan == 3) {
            jenisLayanan = "Express";
            hargaPerKg = 15000;
            estimasiHari = 1;
        } else {
            System.out.println("Pilihan tidak valid!");
            input.close();
            return;
        }

        System.out.print("Masukkan Berat Cucian (kg): ");
        berat = input.nextDouble();

        total = berat * hargaPerKg;

        // Tanggal masuk = hari ini
        LocalDate tanggalMasuk = LocalDate.now();

        // Hitung tanggal selesai
        LocalDate tanggalSelesai = tanggalMasuk.plusDays(estimasiHari);

        System.out.println("\n===== STRUK LAUNDRY =====");
        System.out.println("Nama Pelanggan   : " + namaPelanggan);
        System.out.println("Jenis Layanan    : " + jenisLayanan);
        System.out.println("Berat            : " + berat + " kg");
        System.out.println("Total Bayar      : Rp " + total);
        System.out.println("Tanggal Masuk    : " + tanggalMasuk);
        System.out.println("Selesai Diproses : " + tanggalSelesai);
        System.out.println("Status           : Diproses");
        System.out.println("==========================");

        input.close();
    }
}

