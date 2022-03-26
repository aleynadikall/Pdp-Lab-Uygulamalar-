/*
	Bu bolgede yer alacak degiskenlerin hangileri oldugu daha program baslamadan bellidir.
	Bu bolgede global degiskenler, sabitler, static olarak tanimlanmis lokal degiskenler tutulurlar.
	Statik bellek bolgesinde tutulan degiskenler program calistigi surece var olurlar, program sonlandiginda bellekten silinirler.
*/

#include "stdio.h"

int kontrol;	//global degisken
const float pi = 3.14;		//sabit

int Arttir() {
	static int sayim = 0;	//static olarak tanimlanmis local degisken
	sayim++;
	return sayim;
}

/*
	global degisken, sabit ve static olarak tanimlanmis lokal degisken Statik bellek bolgesinde tutulur.
	Bu sebeple program sonlanincaya kadar bellekte tutulurlar. Bundan dolayi Arttir metodu her cagirildiginda
	sayim degiskeni sifirdan baslamak yerine kalmis oldugu degerden devam edecektir.
*/

int main() {

	printf("%d\n", Arttir());	//1
	printf("%d\n", Arttir());	//2
	printf("%d\n", Arttir());	//3

	return 0;

}