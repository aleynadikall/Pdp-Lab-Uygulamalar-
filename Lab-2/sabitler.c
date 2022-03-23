//Bazen bir program yazilirken pi sayisi veya katsayi gibi degerlerin programin sonuna kadar sabit kalmasi istenebilir.
//C dilinde bunun icin const kullanilir. 
//Java'dan en buyuk farki sabit tanimlandigi yerde degerini  almalidir.

#include "stdio.h"

int main()
{
	const double pi = 3.14;
	double yaricap = 5.2;
	printf("Cevre: %.2lf", 2 * pi * yaricap * yaricap);

	return 0;
}