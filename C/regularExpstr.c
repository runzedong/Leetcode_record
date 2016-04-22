bool isMatch (char* s, char* p){
	if(*p=='\0'){
		if(*s=='\0') 
			return true;
		else 
			return false;
	}
	if(*s=='\0'){
		if(*p=='.')
			return ture;
		else
			return false;
	}
	if(*p=='.'||*s==*p)
		return isMatch(s+1,p+1);
	//if(*p=='*')


}