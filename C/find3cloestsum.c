int partition (int a[],int p,int r){
    int i,j,temp,x;
    x=a[r];
    i=p-1;
    for(j=p;j<r;j++){
        if(a[j]<x){
            i++;
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

    }
    temp=a[i+1];
    a[i+1]=a[r];
    a[r]=temp;
    //printf("%d\n",(i+1));
    return i+1;

}

void quicksort(int a[], int p, int r){
    int q;
    if (p<r){
        q=partition(a,p,r);
        //printf("%d\n",q);
        //printf("%d\n",r);
        quicksort(a,p,q-1);
        quicksort(a,q+1,r);
    }
}

int threeSumClosest(int* nums, int numsSize, int target) {
    int sum_close=INT_MAX;
    int i,start,end;
    int cur_sum;
    int ret_sum;
    quicksort(nums,0,numsSize-1);
    for(i=0;i<numsSize-2;i++){
        start=i+1;
        end=numsSize-1;
        while(start<end){
            cur_sum=nums[i]+nums[start]+nums[end];
            if(abs(cur_sum-target)<sum_close){
                sum_close=abs(cur_sum-target);
                ret_sum=cur_sum;
                if(sum_close==0) return ret_sum;
            }
            if(cur_sum>target){
                end--;
            }
            if(cur_sum<target){
                start++;
            }
        }// while end when start>end
    }//for end when i upto size-2
    return ret_sum;    
}
