/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if_yapilari;

import java.util.Scanner;
/**
 *
 * @author aleyy
 */
public class If_yapilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.print("Bir sayi giriniz:");
        x = in.nextInt();
        if (x % 2 == 0) {
            System.out.println("Girilen sayi cifttir.");
        }
        
        
        //Birden fazla kontrol gerekiyorsa:
        int y;
        System.out.print("Bir sayi Giriniz:");
        y = in.nextInt();
        if( y % 2 == 0) {
            if(y < 100) {
                if (y > 10) {
                    System.out.println("Girilen sayi 10'dan buyuk 100'den kucuk ve cift bir sayidir.");
                }
                else if (y > 5) {
                    System.out.println("Girilen sayi 5'ten buyuk 100'den kucuk ve cift bir sayidir.");
                }
                else {
                    System.out.println("Girilen sayi 5'ten kucuk ve cift bir sayidir.");
                }
            }
        }
            
        
        
    }
    
}
