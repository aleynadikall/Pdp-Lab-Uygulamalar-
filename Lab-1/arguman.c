// C Dili CArg.c

#include "stdio.h"
int main(int argc, char* argv[]) {
	printf("%s\n", argv[1]);
	printf("%s\n", argv[2]);
	return 0;
}

/*
	Komut satiri parametreleri daha program baslamadan once programa belli parametreleri
	girmeyi saglar. Yukaridaki argv[] ifadesinin icine 1.indeksi yazmamizin sebebi 0.indekste
	programin kendisinin tutulmasidir. Bunun disinda C'de argc isminde bir baska parametre de
	bulunmaktadir. Bu argc komut satirindan kac adet parametre girildigini gosterir.

	Komut ekranindan parametre girmek icin oncelikle gcc -o aguman arguman.c ile arguman.exe
	dosyasini olsuturuyoruz. Sonrasinda komut ekranina arguman "girilecek ifade/ler" yaziyoruz
	ve entera bastigimizda ekrana yazilmis oluyor.
*/