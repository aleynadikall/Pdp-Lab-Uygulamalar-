/*
	Kontrol edilecek degerler kesin olarak belli ise switch case yapisi kullanmak daha uygundur.
	Belirli olmasindan kasit ornegin kullanicinin girecegi bir x degerinin belli sayilardan buyuk,
	belli sayilardan kucuk kontrolu if yapisina uygunken girilecek deger sadece 2 veya 3 yani belli
	sayida deger alabiliyorsa switch case yapisi daha uygundur.
	switch case yapisinda switch ifadesinin icerisindeki degiskenin turu ne ise case ifadeleri de o
	turde kontrol edilmelidir.
	
	C dilinde char turunde bir switch case yapisi olusturamayiz. C dilinde switch case sadece tam
	sayilari desteklemektedir.

	Switch case yapisinda bir diger hayati onem tasiyan durum break ifadelerinin mutlaka konulmasidir.
	Konulmamasi durumunda C/C++ ve Java herhangi bir hata vermez fakat break konulmayan case ifadesi
	calismasi durumunda bir lattaki case ifadesini de kontrol etmeden calistiracaktir.
*/

//ERÝSÝLEMEYEN SATÝR DURUMU : Hangi kosulda olursa olsun calistirilamayacak satirdir.
//C dilinde hata vermez, derlenip calisir ancak bu sekilde bir kod yazimi anlamsizdir.
#include "stdio.h"

int main() {

	int turId;
	printf("Tur girin:(1,2,3)");
	scanf("%d", &turId);
	switch (turId)
	{
		case 1:
			printf("Yonetici");
			return 1;
			break;	//Erisilemeyen satir
		case 2:
			printf("Akademisyen");
			return 2;
			break;	//Erisilemeyen satir
		case 3:
			printf("Ogrenci");
			return 3;
			break;	//Erisilemeyen satir
	}

	/*
		Kontrol bloklarinda && || ve ! ifadeleri kullanilabilir. Bunlarin anlami && ifadesi ve , || ifadesi
		veya, ! ifadesi ise degili gosterir. && ifadesinde if blogunun calismasi icin kontrollenden her ikisinin
		de dogru olmasi gerekir.

	*/

	//Girilen sayinin sayinin pozitif cift sayi oldugunun kontrolu
	int sayi;
	printf("Bir sayi giriniz:");
	scanf("%d", &sayi);
	if (sayi % 2 == 0 && sayi >= 0)	printf("Girilen sayi pozitif cift sayidir.");
	else printf("Girilen sayi pozitif cift sayi degildir.");

	/*
		Kontrol ifadeleri boolean turden kontrol yapar ve sonuc true ise calisir false ise calismaz. C dilinde
		0 degeri false diger butun degerler true olarak kabul edilir.
	*/

	if (1) {
		if (135) printf("Merhaba");
	}

	return 0;

}