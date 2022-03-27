
package uclu_operator;

import java.util.Scanner;

public class Uclu_operator {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Sayi:");
        int sayi = in.nextInt();
        String sonuc = (sayi % 2 == 0 ? "Sayi cifttir." : "Sayi tektir.");
        System.out.println(sonuc);
    }
    
}
