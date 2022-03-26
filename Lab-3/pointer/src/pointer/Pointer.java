/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pointer;

/**
 *
 * @author aleyy
 */
public class Pointer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Java gibi ust duzey dillerde bellege dogrudan erisime izin verilmez.
            Aslinda Java'da kullanilan nesnelere erisim sekilleri referanslar
            yardimiyla yapilmaktadir.
            Ama Java'da C dilindeki * ile erisim yapilmamakta heap bellek bolgesini
            gosteren zaten bir referans olmaktadir.
            Kodu inceleyelim:
        */
        
        Sayi p = new Sayi(100);
        Sayi r = new Sayi(50);
        Sayi tmp = p;
        p = r;
        r = tmp;
        System.out.println("p:" + p.deger);        System.out.println("p:" + p.deger);
        System.out.println("r:" + r.deger);


        
        
    }
    
}
