/*
	C ve Java dili dort islemi desteklemektedir ve bunlar icin ozel operatorler vardir.
	Islerde dikkat edilmesi gereken isleme giren operandlardan buyuk tur sonucun da turudur.

	Programlama dillerinde islem oncelikleri vardir:
	+,- sayilarin pozitif ve negatif isaretleri
	++,-- Arttirma, azaltma
	. * Isaretciler(pointer)
	*,/,% Carpma, bolme, moduler
	+, - Toplama,Cikarma
	-=, +=, %=, /=, *= Bilesik atama islemleri
	= Atama islemi

*/

#include "stdio.h"

int main() {

	int x = 1, y ,z, v;
	v = 1;
	y = ++x * 12;
	z = v++ * 12;
	printf("%d\n", y);	//24 (Once arttirilir sonra ekrana yazar.)
	printf("%d\n", z);	//12 (Once ekrana yazar sonra arttirir.)


	return 0;
}