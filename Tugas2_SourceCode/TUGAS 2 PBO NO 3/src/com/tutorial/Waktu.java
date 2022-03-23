/* NIM      : 13020200072
   Nama     : Mega Islamia
   Hari/Tgl : Sabtu, 12 Maret 2022
   Waktu    : 22:04:56 pm
 */
package com.tutorial;
import java.util.Scanner;

public class Waktu {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        int totJam, Jam, totMen, Menit, Detik, konversi;

        System.out.print ("Masukkan total Detik : ");
        konversi = input.nextInt();

        Detik   = konversi % 60;
        totMen  = konversi / 60;
        Menit   = totMen % 60;
        totJam  = totMen / 60;
        Jam     = totJam % 24;

        System.out.println ("Detik sekarang : "+Detik+" Detik");
        System.out.println ("Total Menit    : "+totMen+" Menit");
        System.out.println ("Menit sekarang : "+Menit+" Menit");
        System.out.println ("Total Jam      : "+totJam+" Jam");
        System.out.println ("Jam sekarang   : "+Jam+" Jam");
        System.out.println ("Tampil Waktu   : " +Jam+ ":" +Menit+ ":" +Detik);
    }
}