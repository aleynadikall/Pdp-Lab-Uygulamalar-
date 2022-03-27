/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for_dongusu;

/**
 *
 * @author aleyy
 */
public class For_dongusu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0;;)   //3 bolumun girilmesi zorunlu degildir.
        {
            if(i++ == 100) {
                break;
            }
            if (i % 10 == 0) {
                System.out.println(i);  //(alt alta) 10 20 30 40 ... 100
            }
        }
    }
    
}

/*
    For donngusunun icerdigi 3 bolumun gorevi asagidaki gibi ozetlenebilir.
    for -> ilklenme bolumu bir kez calisir, kontrol yeri her dongude bakilir,
    guncelleme yeri her dongude

    Bazi programlama dillerinde for dongusunun ozel bir hali olan foreach dongusu kullanilir(C#)
    Bu dongu aralik tabanli bir dongudur. Ve bir serideki elemanlari sira sira
    dolasmayi saglar. C++'in bazi versiyonlarinda foreach olarak yazilmasa da aralik
    tabanlı dongu yapisi olusturulabilmektedir.

    Java'da da ayni sekilde foreach kelimesi desteklenmez fakat aralik tabanli
    dongu desteklenir.
*/