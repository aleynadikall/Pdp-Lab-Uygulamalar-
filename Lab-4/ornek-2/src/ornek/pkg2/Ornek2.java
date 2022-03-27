/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ornek.pkg2;

import java.util.Scanner;
/**
 *
 * @author aleyy
 */
public class Ornek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("x:");
        int x = in.nextInt();
        System.out.print("y:");
        int y = in.nextInt();
        
        System.out.print(x > y);    //Ekrana true ya da false yazar.
    }
    
}
