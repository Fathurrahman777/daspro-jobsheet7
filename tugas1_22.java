import java.util.Scanner;
public class tugas1_22 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        int harga = 50000;
        int jmlTiket;
        double diskon;
        double totDiskon =0;
        int totTiket = 0;
        double totHarga;
        double totPenjualan = 0;
        int t = 1;
        
        
      do {
        System.out.print("Jumlah tiket yang dibeli ke-" +t +" Ketik '0' untuk berhenti: " );
        jmlTiket = sc.nextInt();
         if (jmlTiket == 0) {
          break;
         }
        if (jmlTiket <0 ){
          System.out.println("Jumlah tidak valid. silakan input ulang");
          continue;
        }
        if (jmlTiket >10 ){
          diskon = 0.15;
         } else if (jmlTiket >4) {
          diskon = 0.10;
         } else{
          diskon = 0;
         }

         totHarga = harga * jmlTiket;
         totDiskon = totHarga * diskon;
         totPenjualan += totHarga - totDiskon;
         
         System.out.println("Total harga tiket= Rp. " + totHarga);
         System.out.println("Total diskon tiket= Rp. " + totDiskon);
         System.out.println("Total bayar= Rp. " + (totHarga - totDiskon));

     

         t++;
      } while (jmlTiket != 0);
       System.out.println("Total Penjualan: " +totPenjualan);

    }
}
