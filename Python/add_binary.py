def addBinary(a,b):
	carry=0
	res=[]
	lena=len(a)
	lenb=len(b)
	while True:
		if lena and lenb:
			res.append((int(a[lena-1])+int(b[lenb-1])+carry)%2)
			if (int(a[lena-1])+int(b[lenb-1])+carry)>=2:
				carry=1
			else:
				carry=0
			lena-=1
			lenb-=1
		elif lena:
			res.append((int(a[lena-1])+carry)%2)
			if (int(a[lena-1])+carry)>=2:
				carry=1
			else:
				carry=0
			lena-=1
		elif lenb:
			res.append((int(b[lenb-1])+carry)%2)
			if (int(b[lenb-1])+carry)>=2:
				carry=1
			else:
				carry=0
			lenb-=1
		else:
			break
	if carry:
		res.append(1)
	res.reverse()
	return ''.join(str(n) for n in res)

def main():
	a='1'
	b='11'
	sum_ab=addBinary(a,b)
	print(sum_ab)
main()



def xor(m,n):
	"""
	:str type input
	:rtype str
	"""
	if m==1 and n==1:
		return 0
	else:
		return m or n