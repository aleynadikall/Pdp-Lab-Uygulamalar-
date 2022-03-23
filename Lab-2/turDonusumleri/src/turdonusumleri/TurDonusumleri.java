/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package turdonusumleri;

/**
 *
 * @author aleyy
 */
public class TurDonusumleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Kucuk veri turunden buyuk veri turune donusumde bir sikinti yasanmamaktadir.
        int x = 100;
        double a = x;
        System.out.println(a);  //Ekran Ciktisi: 100.0
        
        //Sikinti buyuk veri turunden kucugune donusturuldugunde ortaya cikmaktadir.
        //Java'da but tip bir kullanim yapacaksak atamanin basina (int) getirilmelidir.
        //Yoksa derlenme aninda hata aliriz. 
        //Bunu yapmak Java derleyicisine veri kaybinin farkindayim mesajini vermektedir.
        //Fakat yine veri kaybinin onune gecilemez.
        
        double y = 100.45;
        int b = (int)y;
        System.out.println(b);   //Ekran Ciktisi: 100
        
        
    }   
    
}

/*
    Java'da turler kucuk harf ile basliyorsa ilkel tur, buyuk harfle basliyorsa
    o ilkel turun sinifi oldugunu gosterir. Ek ozellikler kullanilmal isteniyorsa
    sinif olani kullanilmaktadir.
    Ornek: Double, double gibi.
    
*/
