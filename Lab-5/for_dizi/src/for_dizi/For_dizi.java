
package for_dizi;

import  java.util.Scanner;

public class For_dizi {

    
    public static void main(String[] args) {
        
        int[] SayiDizisi = {15, 22, 41, 65, 35, 54, 100};
        System.out.print("Aradiginiz sayi:");
        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();
        for (int i : SayiDizisi) {
            if (i == sayi) {
                System.out.println("Sayi var");
                break;
            }
        }
        
    }
    
}
