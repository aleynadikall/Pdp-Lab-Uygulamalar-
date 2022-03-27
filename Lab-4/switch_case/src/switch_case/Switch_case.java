/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch_case;

import java.util.Scanner;
/**
 *
 * @author aleyy
 */
public class Switch_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            
        
        */
        Scanner in = new Scanner(System.in);
        String ulke;
        System.out.print("Bir ulke girin:");
        ulke = in.nextLine();
        
        //Dikkat edilecegi gibi string turde deger alindigi icin case ifadeleri
        //kontrol etmektedir.
        switch(ulke) {
            case "Turkiye":
                System.out.print("Yurt ici");
                break;
            case "Kibris":
                System.out.print("Yavru vatan");
                break;
            default:
                System.out.print("Yurt disi");
                break;
            /*
                Yukaridaki default ifadesi sw,tch case icin onemli bir undurdur.
                default, eger girilen deger hicbir case ifadesine uymuyorsa
                calisacak olan bloktur. Yazilmasi zorunlu degildir.
                
                Switch case cok kullanilmasina karsin dusuk seviyeli kontrol ifadesidir.
                Bundan dolayidir ki yukarida Java'da yazilan kodu C dilinde yazilamaz.
                Cunku C dilinde switch case yapisinda char* kabul edilmemektedir.
                
            */
        }
        
        
        
        
        
    }
    
}
