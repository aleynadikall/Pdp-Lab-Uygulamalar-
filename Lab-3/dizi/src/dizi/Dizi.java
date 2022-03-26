/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizi;

/**
 *
 * @author aleyy
 */
public class Dizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Java'da dizilere tanimlandiklari yerde deger verilmeli ya da heap
        //bolgesinde olusturulmalidir.
        
        //Asagidaki kod hatalidir.
        int x[5];
        x[0] = 100;
        System.out.println(x[0]);
        
        //Bu kodun su sekilde olmasi gerekir:
        int [] y = {100,200,300};
        System.out.println(y[0]);   //Ekran ciktisi: 100
        
        //veya:
        int [] z = new int[3];
        z[0] = 100;
        System.out.println(z[0]);   //Ekran Ciktisi: 100
        
        
       //Iki boyutlu dizi tanimlama:
       int[][] v = new int[3][3];
       v[0][0] = 100;
       System.out.println(v[0][0]); //Ekran Ciktisi: 100
    }
    
}
