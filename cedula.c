#include <stdio.h>
 
int main() {
 int n;
 int u = 0;
 int d = 0;
 int c = 0;
 int de = 0;
 int v = 0;
 int cd = 0;
 int cem = 0;
 printf("Escolha um valor:");
 scanf("%d", &n);
 
 cem=n/100;
 n%=100;
 cd=n/50;
 n%=50;
 v=n/20;
 n%=20;
 de=n/10;
 n%=10;
 c=n/5;
 n%=5;
 d=n/2;
 n%=2;
 u=n;
 printf("%d nota(s) de R$100,00 \n",cem);
 printf("%d nota(s) de R$50,00\n",cd);
 printf("%d nota(s) de R$20,00\n",v);
 printf("%d nota(s) de R$10,00\n",de);
 printf("%d nota(s) de R$5,00\n",c);
 printf("%d nota(s) de R$2,00\n",d);
 printf("%d nota(s) de R$1,00\n",u); 
    return 0;
}