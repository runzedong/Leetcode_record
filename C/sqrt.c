#include <stdio.h>
/*int mySqrt(int x){
	if(x<0) return 0;
	if(x==0||x==1) return x;
	int low=1;
	int high=x;
	while(low<high){
		int mid=(low+high)/2;
		if(mid==x/mid) return mid;
		if(mid>x/mid){
			if ((low+mid)/2==low){
				return low;
			}
			else{
				high=mid;
				continue;
			}
		}
		else{
			if((high+mid)/2==mid){
				//if(high==x/high) return high;
				return mid;
			}
			else{
				low=mid;
				continue;
			}
		}
	}
}*/
int mySqrt(int x){
    if (x==0||x==1){
        return x;
    }
    int low=0;// not 1 . cause if high=MAX_INT. MID=HIGH+LOW WILL OVER FLOW
    int high=x;
    while ((high-low)>1){
        int mid=(low+high)/2;
        if (mid>x/mid)
            high=mid;
        else
            low=mid;
    }
    return low;
}

int main(int argc, char const *argv[])
{
	int i;
	for (i=0;i<=25;i++){
		printf("%d -> %d\n",i,mySqrt(i));
	}
	return 0;
}