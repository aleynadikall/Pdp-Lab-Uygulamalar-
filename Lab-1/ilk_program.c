//Girilen 4 basamakli bir sayiyi basamaklarina ayirmak:
#include "stdio.h"
//"stdio.h" kutuphanesi printf ve scanf gibi girdi cikti fonksiyonlarinin taninmasi icindir.
#include "locale.h"
/* # karakteri ile baslayan ifadeler on islemci komutlaridir. 
Derleme isleminin hemen oncesinde calistirilirlar. */

/* Calistirilabilir bir C programi olabilmesi icin bir main yani giris fonksiyonuna ihtiyac vardir.
Bu derleyicinin kodun hangi satirindan baslayacagini bilmesi icindir. main fonksiyonu tamamlandiginda
program kapanmis demektir. */
int main()
{
	int sayi;
	setlocale(LC_ALL, "Turkish");	//Turkce karakter destegi icin
	do{
		printf("4 basamakli bir sayi giriniz: ");
		scanf("%d",&sayi);	
	}while(sayi < 1000 || sayi > 10000 );	//4 basamakli sayi kontrolu
	short birler, onlar, yuzler, binler;
	binler = sayi / 1000;
	yuzler = (sayi % 1000) / 100;
	onlar = (sayi % 100) / 10;
	birler =  sayi % 10;
	
	printf("\nBinler:%d\n", binler);
	printf("\nYuzler:%d\n", yuzler);
	printf("\nOnlar:%d\n", onlar);
	printf("\nBirler:%d\n", birler);
	
	getchar();
	return 0;
	/*main fonksiyonunun sonundaki return 0; ifadesi programin, isletim sistemine "her sey yolunda 
	gitti ve islem basariyla tamamlandi" demesidir. */
	
	/* Nasýl Derlenir: Komut satirindan kodun bulundugu klasore gelerek "gcc -o ilk_program 
	ilk_program.c" yazýlýr ve enter tusuna basilirsa derleme gerceklesip ilk_program.exe dosyasi olusur. */
	
}

