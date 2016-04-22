def generateMatrix(n):
	res=[[0 for i in range(n)] for j in range(n)]
	num=0
	layer=n//2
	for i in range(layer):
		for j in range(i,n-i,1):
			num+=1
			print('#1#',j,num)
			print(i,'index',j)
			res[i][j]=num
		for j in range(i+1,n-i,1):
			num+=1
			print('#2#',j,num)
			print(j,'index',n-1-i)
			res[j][n-1-i]=num
		for j in range(n-2-i,i-1,-1):
			num+=1
			print('#3#',j,num)
			print(n-1-i,'index',j)
			res[n-1-i][j]=num
		for j in range(n-2-i,i,-1):
			num+=1
			print('#4#',j,num)
			print(j,'index',i)
			res[j][i]=num
	if n%2==1:
		num+=1
		res[layer][layer]=num
	print(res)
generateMatrix(2)
