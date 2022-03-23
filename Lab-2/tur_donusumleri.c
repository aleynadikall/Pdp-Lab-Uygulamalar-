//Kucuk veri turunden buyuk veri turune donusumde bir sikinti yasanmamaktadir.

#include "stdio.h"

int main()
{
	int x = 100;
	double a = x;
	printf("%lf\n", a);  //Ekran Ciktisi: 100.000000

	//Sikinti buyuk veri turunden kucugune donusturuldugunde ortaya cikmaktadir.
	//C dili esnekligi geregi herhangi bir derleme hatasi vermez. Fakat donusturulen deger boyutu daha kucuk olan veri turune sigmayacaksa veri kaybi olur.
	//Ornegin aagidaki C kodunda ondalik deger tamsayiya donusturulmus ve ondalik kisim kaybolmustur.

	double z = 100.35;
	int b = z;
	printf("%d\n", b);


	return 0;
}