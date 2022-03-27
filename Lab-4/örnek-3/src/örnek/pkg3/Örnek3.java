/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package örnek.pkg3;

import java.util.Scanner;
/**
 *
 * @author aleyy
 */
public class Örnek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Notunuz:");
        double not = in.nextDouble();
        String harf;
        if(not>=90){
            harf = "AA";
        }
        else if (not >= 80) {
            harf = "BA";
        }
        else if (not >= 75) {
            harf = "BB";
        }
        else if (not >= 65) {
            harf = "CB";
        }
        else if (not >= 55) {
            harf = "CC";
        }
        else if (not >= 45) {
            harf = "DC";
        }
        else if (not >= 40) {
            harf = "DD";
        }
        else {
            harf = "FF";
        }
        System.out.println("Harf: " + harf);
    }
    
}
