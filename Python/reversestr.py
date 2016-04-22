def reverseWord(s):
	print(len(s))
	runner=len(s)-1
	walker=len(s)
	res=''
	while runner>=0:
		while runner>0 and s[runner]==' ':
			walker=runner
			runner-=1
		while runner>0 and s[runner]!=' ':
			#print('hey there')
			runner-=1
		if runner is 0:
			if s[runner]!=' ':
				res=res+s[runner:walker]
			else:
				res=res+s[runner+1:walker]
		else:
			res=res+s[runner+1:walker]+' '
			walker=runner
		runner-=1
	if res[-1]==' ':
		res=res[:-1]
	print(len(res))
	print('a'+res+'a')
	return res
print(reverseWord('  i     '))
