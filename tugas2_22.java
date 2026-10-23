import java.util.Scanner;
public class tugas2_22 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);

        int jenis, durasi, total = 0;

        System.out.println("Jenis 1 untuk mobil");
        System.out.println("Jenis 2 untuk motor");
        System.out.println("Jenis 0 untuk keluar");

        do {
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (/Jam): ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;
                } 
                else {
                    total += durasi * 2000;
                }

            }

        } while (jenis !=0 );

        System.out.println("Total pembayaran: Rp. " + total);
    }
    
}
