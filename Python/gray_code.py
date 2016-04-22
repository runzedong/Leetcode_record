def graycode(n):
	res=[0,1]
	for i in range(2,n+1):
		size=len(res)
		for j in range(size-1,-1,-1):
			res.append(res[j]+(1<<(i-1)))
	print(res)

graycode(2)