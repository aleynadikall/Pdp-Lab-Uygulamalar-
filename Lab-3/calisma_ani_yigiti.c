/*
	En aktif bellek bolgesidir denilebilir. Ýsmini de oradan aldigi bu bellek bolgesi bir yigin (stack) seklindedir
	ve bu yapida calisir. Bu yapiya ilk giren en son cikar.
	Bir program calistigi surece genisleyip daralan bitisik bir yapiya sahiptir.
	Bu bellek bolgesinde fonksiyon ve metot cagirimlari ve bu fonksiyon ve metotlarin barindirdigi lokal degiskenler
	bulunur.
	Bir fonksiyon veya metot cagrildiginda bu fonksiyon veya metota ait parametreler degiskenler ve donus degerleri bu
	bellek bolgesinde tutulur.
	Calisma ani yigin bolgesi genislemis olur. Fonksiyon veya metot cagrilan yere dondugunde bu fonksiyon veya metodun
	calisma ani yigininda ayirmis oldugu yer geri dondurur. Dolayisiyla geri dondurulen bu degiskenlere cagrim bittikten
	sonra erisim olamayacaktir.

*/

#include "stdio.h"

int DegerArttir() {
	static int sayac = 0;	//static bellek bolgesinde
	return ++sayac;
}

//Topla metodunun cagirimi bittikten sonra calisma ani yigininda olusturulmus 
//olan a,b ve sonuc degiskenleri bellekten yok edilirler.
int topla(int a, int b) {
	int sonuc = a + b;	//Calisma ani yigitinda
	return sonuc;
}

int degistir(int a, int b) {
	int temp = a;
	a = b;
	b = temp;
	return a;
}

int main() {
	printf("%d\n", DegerArttir());	//1
	printf("%d\n", DegerArttir());	//2
	printf("%d\n", topla(21, 10));	//31
	printf("%d\n", topla(5, 7));	//12
	printf("%d\n", degistir(5, 7));	//7


	return 0;
}