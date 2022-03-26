/*
	C dilinde turu olmayan bir gostericidir. Dolayisiyla yeri geldiginde tamsayiyi gosterebilecegi gibi
	yeri geldiginde de bir ondalik sayiyi da gosterebilir.
	Sadece gostericinin gosterdigi yer kullanilacagi zaman derleyicinin o anki hangi tur oldugu bilmesi
	acisindan donusturme islemi uygulanmaktadir.

	Bunun ornegi asagidaki kod parcasinda gorulebilir:

*/

#include "stdio.h"
#include "stdlib.h"

int main() {
	int x = 100;
	float a = 12.5;
	void* obj;
	obj = &x;
	printf("%d\n", *(int*)(obj));	//100
	obj = &a;
	printf("%.2f\n", *(float*)(obj));	//12.50

	return 0;

	//Bu sekilde bir nevi object turune benzetilebilir.
}