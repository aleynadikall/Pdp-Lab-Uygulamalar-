/*
	Uclu kontrol tek satirda kontrol ve sonucu yazabilmemizi saglar.
	Kontrol Durumu ? Dogru ise calisir : Dogru degil ise calisir.

*/

#include "stdio.h"
#include "stdlib.h"

int main() {

	printf("Sayi:");
	int sayi;
	scanf("%d", &sayi);
	char* sonuc;
	sonuc = (sayi % 2 == 0 ? "Sayi cifttir" : "Sayi tektir.");
	printf("%s", sonuc);

	return 0;
}