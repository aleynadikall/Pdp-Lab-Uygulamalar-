/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heap_bellek;

/**
 *
 * @author aleyy
 */
public class Heap_bellek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Heap bellek bolgesinde yer ayirmak icin Java'da new operatoru kullanilir.
            Java'da da C dilinde oldugu gibi ayrilan yer bellege geri verilmezse
            cop olusur. Fakat Java'da cop toplayici mekanizmasi vardir. Dolayisiyla
            belli araliklarla cop toplayicilar devreye girerek gostericisi olmayan
            bellek bolgesini geri dondururler. Java'da C'de olduğu gibi free metoduna
            benzer bir metod yoktur. İllaki Java'da geri dondurulmek isteniyorsa
            bunun en guzel yolu null'a esitlemektir. Boylelikle Java Sanal makinesinin
            cop toplayicisi calistiginda geri dondurulecektir.
            
        */
        Sayi s = new Sayi(100);
        s = null;   //null'a esitlenmis ve geri dondurulmustur. Fakat bir alt satirina
        //deger yazdirilmaya calisilirsa hata vermedigini ve 100'u ekrana yazdigi
        //gorulecektir.
        System.out.println(s.deger);    //100
        
        
    }   
    
}
