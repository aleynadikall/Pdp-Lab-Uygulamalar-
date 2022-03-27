/*
	Bir programin akisi yukaridan asagi dogru ilerler. Bu ilerleyiste bazi satirlarin bazi kosullarda calistirilmasi istenebilir.
	Bu durumda  kontrol bloklari kullanilmalidir. Karar yapilari, if-if else if else, ternary operator ve switch case seklinde kullanilabilir.

*/

#include "stdio.h"

int main() {

	int x;
	printf("Bir sayi girin:");
	scanf("%d", &x);
	if (x % 2 == 0)	
		printf("Girilen sayi cifttir.\n");

	//Birden cok kontrol yapilmasi gerekiyorsa:
	int y;
	printf("Bir sayi giriniz:");
	scanf("%d", &y);
	if (y % 2 == 0)
		if (y < 100)
			if (y > 10)
				printf("Girilen sayi 10'dan buyuk 100'den kucuk bir cift sayidir.\n");


	return 0;
}