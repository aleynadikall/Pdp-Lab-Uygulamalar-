//GIRILEN IFADEYI EKRANA YAZAN JAVA KODU:

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ilkproje;
/*  package paket tanimlamasi icin kullanilir. Amaci isim benzerliginin ve bundan
    dogacak problemlerin onune gecmektir.

    Paket ismi klasor ismi ile ayni olmalidir.
*/

import java.util.Scanner;
/* 
    Girdi almak icin kullanilan Scanner sinifi import kelimesi ile projeye
    ekleriz. Bunu yapmazsak hata aliriz.

    Java'da kutuphanelerin, siniflarin veya farkli dosyalarin yazilan projeye
    eklenmesi import kelimesi ile olmaktadir.

    import java.util.*; seklinde de yazilabilir. "*" karkteri paketin hepsini
    dahil eder. util paketindeki her sey dahil edilecektir. Eger import yazilmadan
    kullanilmak isteniyorsa bu durumda her kullanista tampaket yolu yazilmalidir.
    java.util.Scanner scan = new java.util.Scanner(System.in); gibi
    
*/

/**
 *
 * @author aleyy
 */
public class IlkProje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
            main metodunun basina static konulmasinin nedeni main metodu nesne
            olusumu baslamadan once calismaya baslar. Eger static olmasaydi
            nesnesi olusturulup metodun cagirilmasi gerkecekti.
        
            Static siniflardan bir nesne (new) türetilemez.
        */
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir ifade girin: ");
        String girilen = scan.nextLine();
        System.out.println(girilen);
    }
    
}
/* Java dilinin destekledigi ozellikleri madde halinde yazacak olursak:
-Tasarimi kolay
-Nesne yonelimli
-Tasinabilen
-Yorumlanabilen
-Guvenli
-Yuksek performansli
-Coklu-Thread destekleyen
-Dinamik
*/

//Kaynak koddan makinenin anlayacagi assembly koda cevirenlere derleyici denir.

//Derleyiciler ekstra kutuphane ve nesne dosyalarini da linker yardimiyla derleme
//surecine dahil ederler.

/*
    Uygun derleyici yardimiyla bir program kodu herhangi bir makine koduna cevirebilir.
    Fakat bir makine kodu sadece ilgili ozel makinede calisacaktir. İste Java bu
    engeli ortadan kaldirmak icin herhangi bir platformda calisabilecek sekilde
    tasarlamistir. Bunu yaparken Java kaynak kodu ozel bir makine koduna cevirir.
    Bu makine koduna Byte Kod (bytecode) denir. Bu Byte Kod istediginiz herhangi
    bir makinede Java sanal makinesi (Java virtual machine) yardimiyla calistiri
    labilir.
*/

/*
    Her Java programi en az bir sinifa sahiptir.

    Sinif metot ve verileri iceren yapidir. Sinirlar ".java" uzantili dosyalardir.

    Nesne dosyasi olsuturuldugunda ".class" seklinde bir dosya olusur.

    Java'daen basit programi yazmak icin bile sinif tanimlamak bir zorunluluktur.

*/
