#include "stdio.h"

int main() {

	printf("0\n");
	printf("1\n");
	printf("2\n");
	printf("3\n");

	//Kisaca:
	for (int i = 0; i < 4; i++) {
		printf("%d\n", i);
	}

	return 0;
}

/*
	Dongunun kac kez donecegi belli ise bu durumlarda for dongusu kullanmak daha uygundur.
	for dongusu 3 bolumden olusur ve 3 bolumun de girilmesi zorunlu degildir. Bu Java icin de gecerlidir.
*/