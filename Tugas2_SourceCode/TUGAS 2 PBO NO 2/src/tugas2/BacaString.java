/* NIM          : 13020200072
   Nama         : Mega Islamia
   Hari/Tanggal : Minggu, 13 Maret 2022
   Waktu        : 18:50:55 pm
 */
package tugas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
public class BacaString {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /* kamus */
        String str;

        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        /* Program */
        System.out.print ("\nBaca string dan Integer: \n");
        System.out.print ("masukkan sebuah string: ");
        str= datAIn.readLine();
        System.out.print ("String yang dibaca : "+ str);
    }
}
