#include <stdio.h>
double myPow(double x, int n){
	if(n==0) 
		return 1;
	if(n==1)
		return x;
	if(n==-1)
		return 1/x;
	return myPow(x*x,n/2)*(n%2==0?1:n>0?x:1/x);  
}
int main(int argc, char const *argv[])
{
	double x=0.00001;
	int n=2176763;
	printf("%g ",myPow(x,n));
	return 0;
}