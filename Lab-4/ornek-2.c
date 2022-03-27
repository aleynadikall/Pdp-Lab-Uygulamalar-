//Dizideki eleman ve indeks degerlei verilerek ilgili indekste eleman var mi yok mu kontrolu:

#include "stdio.h"
#include "stdlib.h"

int main() {

	//10 uzunlugunda int dizisi
	int* dizi = malloc(10 * sizeof(int));
	dizi[0] = 25;
	dizi[1] = 32;
	dizi[2] = 40;
	dizi[3] = 3;
	dizi[4] = 11;
	dizi[5] = 7;
	dizi[6] = 65;
	dizi[7] = 54;
	dizi[8] = 47;
	dizi[9] = 70;

	int sayi, indeks;
	printf("Hangi sayiyi ariyorsunuz?:");
	scanf("%d", &sayi);
	printf("Sayiyi hangi indekste ariyorsunuz?:");
	scanf("%d", &indeks);
	if (dizi[indeks] == sayi) printf("Sayi var");
	else printf("Sayi yok.");
	free(dizi);

	return 0;
}