def zigzag(s,rows):
	if rows==1:
		return s
	res=['']*rows
	size=rows*2-2
	for i in range(rows):
		for j in range(i,len(s),size):
			res[i]+=s[j]
			if i!=0 and i!=rows-1 and j+size-2*i<len(s):
				print(s[j+size-2*i])
				print('res[i]--i',i,res[i])
				res[i]+=s[j+size-2*i]
		print('0--',res[0])
		print('1--',res[1])
		print('2--',res[2])
	return ''.join(res)

print(zigzag('PAYPALISHIRING',3))