def isNumber(s):
	"""
	:type s: str
	:rtype: bool
	"""
	#if not . E, e, [0-9] and +, -
	#return False
	#else we check the validation
	s=s.strip()#remove all the whitespace
	if not s:
		return False
	dotflag=False
	eflag=False
	for i in range(len(s)):
		if s[i]=='.':
			if dotflag or (i>0 and (s[i-1]=='e' or s[i-1]=='E')) or (i==0 and not s[i+1].isdigit()) or (i==len(s)-1 and not s[i-1].isdigit()):
				print('do we get there?')
				return False
			dotflag=True
		elif s[i]=='+' or s[i]=='-':
			if (i>0 and (s[i-1]!='e' or s[i-1]!='E')) or i==len(s)-1 or (not s[i+1].isdigit() and s[i+1]!='.'):
				print('do we get there??')
				print('which i ', i)
				print((not s[i+1].isdigit() and s[i+1]!='.'))
				return False
		elif s[i]=='e' or s[i]=='E':
			if eflag or i==0 or i==len(s)-1:
				print('do we get there???')
				return False
			eflag=True
		elif s[i].isdigit():
			continue
		else:
			return False
		return True
print(isNumber('-.'))