//Diziler

/*
	Homojen verilerin bir araya gelerek olsuturduklari yapidir.
	Bir dizi icerisinde ayni tur veri bulunur.
	Dizi indeksi sifirdan basladigi icin son indeks "elemansayisi-1" olarak ifade edilir.

*/

#include "stdio.h"

int main() {

	int x[5];
	x[0] = 100;
	printf("%d\n", x[0]);

	/*
		Ýki boyutlu dizi tanimlamasinda dikkat edilmesi gereken dizilerin arka planda aslinda
		gosterici seklinde tutulduklaridir.
	*/
	int y[3][3];
	y[0][0] = 100;
	printf("%d", y[0][0]);


	/*
		Dizilerin bellekte tutulma sekilleri bir gostercinin bellekte tutulma sekli ile aynidir.
		Yapilan is sadece ilk elemanin adresini tutmaktir. Derleyici dizinin ilk elemaninin adresini
		tutmakla yetinecegi icin dizilerin tanimlandiklari yerde boyutlari belirtilmelidir ki derleyici
		adresi nereye kadar arttirabilecegini bilsin. Siz sayilar[3]'teki elemani getir dediginizde
		derleyici arka tarafta aslinda *(sayilar+3) adresindeki degeri getir demektir.
	*/



	return 0;
}