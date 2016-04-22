#include <stdio.h>
int rtod (char c){
	switch(c) {  
        case 'I': return 1;  
        case 'V': return 5;  
        case 'X': return 10;  
        case 'L': return 50;  
        case 'C': return 100;  
        case 'D': return 500;  
        case 'M': return 1000;  
        default: return 0;  
      }  
}

int romanToInt(char* s){
	int number=0;
	int i=0;
	char prev=s[0];
	//printf("%d\n",prev);
	while(s[i]){
		//printf("%d\n",prev);
		if(rtod(s[i])-rtod(prev)>0){
			number=number+rtod(s[i])-2*rtod(prev);
		}
		else{
			number=number+rtod(s[i]);
		}
		printf("%d\n",number);
		prev=s[i];
		i++;
	}
	return number;
}

int main(){
	char str[]="DXIV";
	printf("%d\n",romanToInt(str));
	return 0;
}

