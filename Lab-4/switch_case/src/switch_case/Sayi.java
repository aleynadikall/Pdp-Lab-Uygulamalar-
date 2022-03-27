/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switch_case;

/**
 *
 * @author aleyy
 */
public class Sayi {
    //ERİSİLEMEYEN SATİR DURUMU : Java gibi yuksek seviyeli bir dil erisilemeyen
        //satira izin vermez. Ornegin asagidaki kodda return altinda berak kullanilmistir.
        //Bu satira hicbir durumda erisilemez:
        
        public static int deger;
        
        public Sayi(int dgr) {
            deger = dgr;
        }
        
        public int DegerAta(Double yeniDeger) {
            String dgr = Double.toString(yeniDeger);
            String ondalik = dgr.substring(dgr.indexOf('.') + 1, dgr.length());
            int ondalikKismi = Integer.parseInt(ondalik);
            
            switch(ondalikKismi) {
                case 0: //ondalik kismi yoktur.
                    deger = yeniDeger.intValue();
                    return deger;
                    break;  //Erisilemeyen satir. (unreachable statement)
            }
            
            return 0;
        }
}
