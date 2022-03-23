/* NIM          : 13020200072
   Nama         : Mega Islamia
   Hari/Tanggal : Minggu, 13 Maret 2022
   Waktu        : 19:32:59 pm
 */
package tugas2;
import java.util.Scanner;
/* contoh pemakaian IF dua kasus komplementer */
/* Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >=0 */
/* 'Nilai a negatif , nilai a', jika a <0 */
public class If2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan=new Scanner(System.in);

        /* Program */
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :");
        a=masukan.nextInt();
        if (a >= 0){
            System.out.println ("Nilai a positif "+ a);
        }else /* a< 0 */
        {
            System.out.println ("Nilai a negatif "+ a);
        }
    }
}
