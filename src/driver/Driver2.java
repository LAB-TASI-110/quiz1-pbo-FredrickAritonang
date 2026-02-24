public class Driver2 {

    public static void main(String[] args) {
        
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Input jumlah total data
        int N = input.nextInt();

        // Input deret nilai
        int[] nilai = new int[N];
        for (int i = 0; i < N; i++) {
            nilai[i] = input.nextInt();
        }

        // Input kode kelompok
        int kelompok = input.nextInt();

        int index = 0;
        int currentKelompok = 1;

        // Mencari posisi awal kelompok yang diminta
        while (currentKelompok < kelompok) {
            index += currentKelompok;
            currentKelompok++;
        }

        // Menjumlahkan nilai pada kelompok tersebut
        int total = 0;
        for (int i = 0; i < kelompok; i++) {
            total += nilai[index + i];
        }

        // Output hasil
        System.out.println(total);

        input.close();
    }
}

