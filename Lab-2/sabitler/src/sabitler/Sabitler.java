/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sabitler;

/**
 *
 * @author aleyy
 */
public class Sabitler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Bazen programlar yazilirken bazi degerlerin programin sonuna kadar
            sabitkalmasi gerekmektedir. Bu tip degerleri Java'da final ifadesi
            ile sabit yapariz.
        
            Java dilindeki sabitin tanimlandigi yerde degerinin atanmasi kurali
            yoktur. (C dilinde atandigi an degerinin girilmesi gerekir.)
        */
        
        final double yercekimi;
        double kuvvet, kutle = 78;
        yercekimi = 9.81;   //C dilinde bu kullanima izin verilmez.
        kuvvet = kutle * yercekimi;
        System.out.println(kuvvet);
    }
    
}
