/* NIM          : 13020200072
   Nama         : Mega Islamia
   Hari/Tanggal : Minggu, 13 Maret 2022
   Waktu        : 22:23:45 pm
 */
package tugas2;
import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan WHILE */
public class PrintXWhile {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);

        /* Program */
        Sum = 0;                                                        /* Inisialisasi */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();                                          /* First Elmt*/
        while (x != 999) {                                              /* Kondisi berhenti */
            Sum = Sum + x;                                              /* Proses */
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt();                                      /* First Elmt*/
        }
        System.out.println("Hasil penjumlahan = "+ Sum);                /* Terminasi */
    }
}