/*
	Bu bellek bolgesi C ve C++ programlama dillerinde dikkat edilmesi gereken cok onemli bir bolgedir.
	Cunku C ve C++ gibi dillerde bu bolgenin kontrolu programciya birakilmistir.
	Bu da demek oluyor ki eger bu bolgenin kontrolu iyi saglanmaz ise bellek tasmasi ya da yanlis degerlere
	erisim gibi problemler ile karsi karsiya kalinabilir.
	Bu bolgeye duyulan ihtiyacin nedeni dinamik olsuturulan yapilarin boyutlari degisken olacak ve calisma
	aninda belirlenecektir.
	Dolayisiyla bu yapilar heap bellek bolgesinde tutulmali, bu yapilara ve degiskenlere gostericiler yardimi
	ile erisilmelidir.
	Bu bellek bolgesinde tutulan bir degerin adi yoktur yani anonimdir ve ancak degerin bulundugu adresi
	gosterecek bir gosterici yardimiyla erisilebilir.

	Heap bellek bolgesinde C programlama dilinde bir yer ayirmak icin malloc kullanilir. C dilinde malloc
	kullanilmadan tanimlanan gostericiler heap bolgesinden yer ayiramazlar.

*/

#include "stdio.h"
#include "stdlib.h"		//malloc icin gereken kutuphane

int main() {

	int* yas = malloc(sizeof(int));		//Heap bellek bolgesi
	*yas = 30;
	printf("%d\n", *yas);	//30
	int *p;		//adresi yok.

	/*
		Heap bellek bolgesinde ayrilan yer C dilinde isi bittiginde bellege geri verilmelidir. Bu bolgenin
		kontrolu programcida oldugu icin eger geri dondurulmez ise cop dedigimiz durum olusur.
		Bu nedenle yasi free ediyoruz.

		Hatirlanirsa bu bolgedeki adreslere calisma ani yiginindaki gostericiler yardimiyla erisiliyordu.
		Dolayisiyla calisma nai yiginindaki gostericiler once heap bellek bolgesinde ayrilan yer geri
		dondurulmelidir. Yoksa o bolge bilgisayar kapanincaya kadar kullanilamaz duruma gelir.

	*/
	free(yas);
	

	return 0;
}