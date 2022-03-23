/* NIM          : 13020200072
   Nama         : Mega Islamia
   Hari/Tanggal : Minggu, 13 Maret 2022
   Waktu        : 21:51:38 pm
 */
package tugas2;
import java.util.Scanner;

/* Baca N, Print 1 s/d N dengan FOR */
public class PriFor {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int i,N;
        Scanner masukan=new Scanner(System.in);

        /* program */
        System.out.print ("Baca N, print 1 s/d N ");
        System.out.print ("N = ");
        N=masukan.nextInt();
        for (i = 1; i <= N; i++){
            System.out.println (i); };
        System.out.println ("Akhir program \n");
    }
}
