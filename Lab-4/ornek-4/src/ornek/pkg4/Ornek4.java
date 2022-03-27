/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ornek.pkg4;

import java.util.Scanner;
/**
 *
 * @author aleyy
 */
public class Ornek4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dizideki eleman ve indeks degerlei verilerek ilgili indekste eleman var mi yok mu kontrolu:
        
        Scanner girdi = new Scanner(System.in);
        int[] dizi = new int[10];
        dizi[0] = 25;
	dizi[1] = 32;
	dizi[2] = 40;
	dizi[3] = 3;
	dizi[4] = 11;
	dizi[5] = 7;
	dizi[6] = 65;
	dizi[7] = 54;
	dizi[8] = 47;
	dizi[9] = 70;
        int sayi, indeks;
        
        System.out.print("Hangi sayiyi ariyorsunuz?:");
        sayi = girdi.nextInt();
        System.out.print("Sayiyi hangi indekste ariyorsunuz?:");
        indeks = girdi.nextInt();
        
        if(dizi[indeks] == sayi) {
            System.out.println("Sayi var");
        }
        else {
            System.out.println("Sayi yok.");
        }
        
    }
    
}
