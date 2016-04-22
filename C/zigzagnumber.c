#include <stdio.h>
#include <string.h>
#include <stdbool.h>
void zigzagnumber(int a[], int len){
	bool flag=true; //flag =1 means <. flag=-1 means >
	int swap;
	int i;
	for (i=0;i<len-1;i++){
		if(flag){
			if(a[i]>a[i+1]){
				swap=a[i];
				a[i]=a[i+1];
				a[i+1]=swap;
			}
		}
		else{
			if(a[i]<a[i+1]){
				swap=a[i];
				a[i]=a[i+1];
				a[i+1]=swap;
			}
		}
		flag=!flag;
		}
	}
int main()
{
	int i;
    int  arr[] = {4};
    int n = sizeof(arr)/sizeof(arr[0]);
    zigzagnumber(arr, n);
    for (i=0; i<n; i++)
        printf("%d\n",arr[i]);
    return 0;
}
// control the compare with flag 