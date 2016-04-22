#include <stdio.h>

void merge(int *nums1, int m, int *nums2, int n){
	int temp[m+n];
	int k=0;
	int i=0;
	int j=0;
	while(i<m&&j<n){
		if(nums1[i]<nums2[j]){
			temp[k]=nums1[i];
			i++;
		}
		else{
			temp[k]=nums2[j];
			j++;
		}
		k++;
	}
	while(j<n){
		temp[k]=nums2[j];
		j++;
		k++;
	}
	while(i<m){
		temp[k]=nums1[i];
		i++;
		k++;
	}
	for(k=0;k<9;k++){
		nums1[k]=temp[k];
	}
}

int main(int argc, char const *argv[])
{
	int a[]={1,3,5,7,9};
	int b[]={2,4,6,8};
	int i;
	merge(a,5,b,4);
	return 0;
}