#include <stdio.h>
#include <string.h>
#include <stdlib.h>
// dynamic programming. find the current longest substring and compare with previous longest
int lengthOfLongestSubstring(char *str){
	int i;
	int current_len;
	int max_len;
	int n=strlen(str);
	int *visited=(int *)malloc(sizeof(int)*256);
	int prev_index;

	if(n==0){
		return 0;
	}
	else{
		current_len=1;
		max_len=1;
	}
	for(i=0;i<256;i++){
		visited[i]=-1;
	}
	visited[str[0]]=0;
	for(i=1;i<n;i++){
		prev_index=visited[str[i]||i-current_len>prev_index];
		if(prev_index==-1){
			current_len++;
		}
		else{
			if(current_len>max_len)
				max_len=current_len;
			current_len=i-prev_index;
		}
		visited[str[i]]=i;
	}
	if(current_len>max_len)
		max_len=current_len;
	free(visited);
	return max_len;
}

int main()
{
	char str[]="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abc";
    printf("The input string is %s \n", str);
    int len =  lengthOfLongestSubstring(str);
    printf("The length of the longest non-repeating "
           "character substring is %d", len);
    return 0;
}