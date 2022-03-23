/*
	C dilinde Boolean veri tipine yer verilmemistir. Sifir degeri C dilinde yanlis kabul edilir.
	Sifir disindaki tum degerler dogrudur.
*/

#include <stdio.h>

typedef enum {
	false, true
} bool;

int main() {

	//Ekrana Sakarya degerini yazdirir.
	if (200) printf("Sakarya\n");
	else printf("Ankara\n");


	//Ekrana Sakarya yazdirir.
	bool x = true;
	if (x)
		printf("Sakarya\n");
	else
		printf("Ankara\n");


	//Ekrana Ankara yazdirir.
	bool y = false;
	if (y == true)
		printf("Sakarya\n");
	else
		printf("Ankara\n");

	return 0;
}