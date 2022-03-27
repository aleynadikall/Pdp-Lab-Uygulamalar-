/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ornek.pkg1;

import java.util.Scanner;
/**
 *
 * @author aleyy
 */
public class Ornek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // || ifadesinde kontrollerden birinin dogru olmasi if blogunun calismasini saglar.
        
        Scanner in = new Scanner(System.in);
        System.out.print("x:");
        int x = in.nextInt();
        System.out.print("y:");
        int y = in.nextInt();
        
        if(x % 2 == 0 || y % 2 == 0) {
            System.out.println("x * y cifttir.");
        } else {
            System.out.println("x * y tektir.");
        }
    }
    
}
