/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statik_bellek;

/**
 *
 * @author aleyy
 */
public class Statik_bellek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Java'da metot icerisinde static kullanımına izin yoktur. Sadece sinif
            icerisindeki elemanlar static olarak tanimlanabilir. Bunun da anlami
            bu eleman siniftan turetilecek butun nesneler icin ortak ve aynidir.
        
            Asagidaki Java kodu incelendiginde C dilinin aksine ekrana her zaman
            ayni sayiyi yazacaktir. Bunun da nedeni basittir. Static olarak tanimlanmis
            Sayi sinifinin deger elemani tum nesneler icin ortak olacak ve ustunde
            yapilmis en son degisikligi koruyacaktir.
        
        */
        
        Sayi p = new Sayi(100);
        Sayi r = new Sayi(50);
        Sayi tmp = p;
        p = r;
        r = tmp;
        System.out.println("p:" + p.deger); //p:50
        System.out.println("r:" + r.deger); //r:50

        /*
            Global degiskenler statik bellek bolgesinde tutulduklari icin program
            sonlanincaya kadar bellekte tutulacaktir ve programin herhangi bir
            satirindan bu degiskenlere erisilebilecektir. İste bu yuzden global
            kullanimi (degisip degismediklerinin kontrolu zor oldugu icin) tavsiye
            edilmemektedir.
        */
    }
    
}
