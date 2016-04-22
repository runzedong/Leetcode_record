def numdecode(s):
	"""
	:type s. string
	:rtype int.
	"""
	res=[0]*3
	if not s or s[0]=='0':
		return 0
	size=len(s)
	if size==1:
		return 1
	res[1]=1
	res[0]=1
	#in general loop s>=2
	for i in range(1,size):
		if s[i-1]=='0':
			if s[i]=='0':
				return 0
			else:
				res[2]=res[1]
		elif s[i-1]=='1':
			if s[i]=='0':
				res[2]=res[0]
			else:
				res[2]=res[1]+res[0]
		elif s[i-1]=='2':
			if '1'<=s[i]<='6':
				res[2]=res[1]+res[0]
			elif s[i]=='0':
				res[2]=res[0]
			else:
				res[2]=res[1]
		else:
			if s[i]=='0':
				return 0
			else:
				res[2]=res[1]
		print('let check when s[1], res 2,1,0',i,res[2],res[1],res[0])
		res[0]=res[1]
		res[1]=res[2]
		print('after swap',res[0],res[1])
	return res[2]
def main():
	s='110'
	print(numdecode(s))
main()
