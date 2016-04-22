def isPalindrome(s):
	"""
	:type s:str
	:type return: bool
	"""
	s=s.lower()
	low=0
	high=len(s)-1
	while low<high:
		if s[low].isalnum()==False:
			low+=1
			continue
		elif s[high].isalnum()==False:
			high-=1
			continue
		elif s[low]!=s[high]:
			return False
		else:
			low+=1
			high-=1
	return True
def main():
	s='A man , a plan, a canal: PANAMA'
	t=''
	if isPalindrome(t):
		print('it is isPalindrome')
	else:
		print('oops. it is not!') 

main()
