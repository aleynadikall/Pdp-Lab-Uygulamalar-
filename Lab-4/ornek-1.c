#include "stdio.h"

int main() {
	double notu;
	char* harf;
	printf("Notunuz (0-100): ");
	scanf("%lf", &notu);	//C dilinde kullanicidan alinacak sayi double ise %lf kullanilir.

	if (notu < 40) harf = "FF";
	else if (notu < 45) harf = "DD";
	else if (notu < 55) harf = "DC";
	else if (notu < 65) harf = "CC";
	else if (notu < 75) harf = "CB";
	else if (notu < 80) harf = "BB";
	else if (notu < 90) harf = "BA";
	else  harf = "AA";
	printf("Harf: %s\n", harf);

	return 0;
}