#include <stdio.h>
#include <string.h>
int strStr(char* haystack, char* needle) {
    if(haystack[0]=='\0'&&needle[0]=='\0'||needle[0]=='\0') return 0;
    int len1=strlen(haystack);
    int len2=strlen(needle);
    int i,j,index;
    if(len2>len1) return -1;
    for (i=0;i<len1;i++){
    	printf("the start iiiiiii is %d\n",i);
        index=i;
        printf("index start %d\n",index);
        j=0;
        while(haystack[i]==needle[j]){
            i++;
            j++;
            printf("%d\n",index);
            if(needle[j]=='\0') return index;
        }
        i=index; // cause we use i in the innerloop . when the inner loop break, give the index to i. 
    }
    return -1;
}
int main(int argc, char const *argv[])
{
	char str[]="mississippi";
	char needle[]="issip";
	int result=strStr(str,needle);
	printf("the result is %d\n",result);
	return 0;
}