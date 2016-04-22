int reverse(int x){
	int reminder;
	int quotient;
	int result=0;
	int negative=1;
	if(x<0){
		x=-x;
		negative=-1;
	}
	while(x/10||x>10){
		quotient=x/10;
		reminder=x%10;
		result=result*10+reminder;
		x=quotient;
	}
	return (result*10+x)*negative;

}