/* NIM          : 13020200072
   Nama         : Mega Islamia
   Hari/Tanggal : Minggu, 13 Maret 2022
   Waktu        : 18:16:28 pm
 */
package tugas2;

/* pemakaian beberapa operator terhadap RELATIONAL DAN bit */
public class Oper2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* KAMUS */
        char i, j;

        /* ALGORITMA */
        i = 3; /* 00000011 dalam biner */
        j = 4; /* 00000100 dalam biner */
        System.out.println("i = "+ (int) i);
        System.out.println("j = "+ j);
        System.out.println("i & j = "+ (i & j)); /* 0: 00000000 dalambiner */
        System.out.println("i | j = "+ (i | j)); /* 7:00000111 biner */
        System.out.println("i ^ j = "+ (i ^ j)); /* 7:00000111 biner Ingat!!! operator "^" pada bahasa java bukansebagai pangkat*/
        System.out.println(Math.pow(i, j));      /* Class Mathmemiliki method pow(a,b) untuk pemangkatan*/
        System.out.println(" ~i = "+ ~i);        /* -4: 11111100 biner */
    }
}
