/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ilkelturler;

/**
 *
 * @author aleyy
 */
public class IlkelTurler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // double floata gore bize daha dogru bir ondalik kisim verir.
        float x = 10f;
        double a = 10;
        float y = 3f;
        double b = 3;
        float z = x / y;
        double c = a / b;
        System.out.println("float:" + z);
        System.out.println("double:" + c);
        
        //double ve float turundeki ayni sayilar birbirine esit degildir.
        float k = 0.1f;
        /*
            Java'da ondalik sayilar varsayilan olarak double oldugu icin
            float olarak tanimlanan sayilarin sonuna f yazilmasi gerekir.
        */
        double m = 0.1;
        if (k == m){
            System.out.println("k ve m esittir.");
        } else {
            System.out.println("Esit degil");
        }
    }
    
}

/*
    Java'da int, float, double gibi butun ilkel turlerin boyutlari her platformda
    sabittir. Bu tasinilabilirligin getirmis oldugu bir zorunluluktur. Bundan dolayidir
    ki Java'da sizeof operatoru yoktur.

*/