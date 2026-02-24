public class Driver1 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        String kode;
        int porsiButet;
        int porsiUcok;
        int totalPorsi;
        int harga = 0;
        int totalItem;
        int totalBelanja = 0;

        System.out.println("Masukkan Kode Menu dan Porsi Butet");
        System.out.println("Ketik END untuk selesai");

        while (true) {

            kode = input.next();

            if (kode.equalsIgnoreCase("END")) {
                break;
            }

            porsiButet = input.nextInt();
            porsiUcok = porsiButet * 2; // Perbandingan 2:1
            totalPorsi = porsiButet + porsiUcok;

            String namaMenu = "";

            switch (kode.toUpperCase()) {
                case "NGS":
                    namaMenu = "Nasi Goreng Spesial";
                    harga = 15000;
                    break;
                case "AP":
                    namaMenu = "Ayam Penyet";
                    harga = 20000;
                    break;
                case "SA":
                    namaMenu = "Sate Ayam";
                    harga = 25000;
                    break;
                case "BU":
                    namaMenu = "Bakso Urat";
                    harga = 18000;
                    break;
                case "MAP":
                    namaMenu = "Mie Ayam Pangsit";
                    harga = 15000;
                    break;
                case "GG":
                    namaMenu = "Gado-Gado";
                    harga = 15000;
                    break;
                case "SAM":
                    namaMenu = "Soto Ayam";
                    harga = 17000;
                    break;
                case "RD":
                    namaMenu = "Rendang Daging";
                    harga = 25000;
                    break;
                case "IB":
                    namaMenu = "Ikan Bakar";
                    harga = 35000;
                    break;
                case "NUK":
                    namaMenu = "Nasi Uduk Komplit";
                    harga = 20000;
                    break;
                default:
                    System.out.println("Kode tidak valid!");
                    continue;
            }

            totalItem = totalPorsi * harga;
            totalBelanja += totalItem;

            System.out.printf("%-25s %3d x %7d = %8d\n",
                    namaMenu, totalPorsi, harga, totalItem);
        }

        // Hitung Diskon Kupon
        double diskon = 0;
        String kupon = "Tidak ada";

        if (totalBelanja >= 500000) {
            diskon = 0.25;
            kupon = "Kupon Hitam (25%)";
        } else if (totalBelanja >= 400000) {
            diskon = 0.20;
            kupon = "Kupon Hijau (20%)";
        } else if (totalBelanja >= 300000) {
            diskon = 0.15;
            kupon = "Kupon Merah (15%)";
        } else if (totalBelanja >= 200000) {
            diskon = 0.10;
            kupon = "Kupon Kuning (10%)";
        } else if (totalBelanja >= 100000) {
            diskon = 0.05;
            kupon = "Kupon Biru (5%)";
        }

        int potongan = (int) (totalBelanja * diskon);
        int totalBayar = totalBelanja - potongan;

        System.out.println("=====================================");
        System.out.println("Total Belanja : " + totalBelanja);
        System.out.println("Diskon        : " + potongan);
        System.out.println("Jenis Kupon   : " + kupon);
        System.out.println("-------------------------------------");
        System.out.println("Total Bayar   : " + totalBayar);
        System.out.println("=====================================");

        input.close();
    }
}
