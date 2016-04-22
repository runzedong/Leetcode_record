#include <stdio.h>
double myPow(double x, int n){
	double result;
	if(n==0){
		return 1;
	}
	if(n==1){
		return x;
	}
	if(n==-1){
		return 1/x;
	}
	if(n%2==0){
		myPow(x,n/2)*myPow(x,n/2);
	}
	else{
		myPow(x,n/2)*myPow(x,n/2)*x;
	}
}
int main(int argc, char const *argv[])
{
	double x=0.1;
	int n=7;
	printf("%g ",myPow(x,n));
	return 0;
}