/* NIM      : 13020200072
   Nama     : Mega Islamia
   Hari/Tgl : Minggu, 13 Maret 2022
   Waktu    : 01:32:00 am
 */
package tugas2;
import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner*/
public class BacaData {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan;

        /* Program */
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); Apa akibatnya ?*/
        System.out.print ("Nilai yang dibaca : "+ a);
    }
}
