/*
	Gostericilerin icinde tuttuklari deger adres degerleridir.
	Gostericilerin gelistirilme amaci dolayli(indirect) adreslemenin gucunden faydalanmak (makineye yakin dillerde daha cok kullanilir)
	ve dinamik bellek yonetimini saglamak icindir.
	Bu bellek bolgesine heap bellek bolgesi adi verilir. 

*/

#include "stdio.h"

int main() {

	int x = 100, y = 50;

	//p ve r birer referanstir.
	int* p = &x;
	int* r = &y;
	int* temp = p;
	p = r;
	r = temp;
	printf("p:%d\n", *p);	//p:50
	printf("r:%d\n", *r);	//r:100

	return 0;
}