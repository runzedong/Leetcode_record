def getPermutation(n,k):
	res=[]
	temp=[]
	used=[False]*n
	helper(n,res,temp,used,k)
	print(n)
	print(res)

def helper(n,res,temp,used,k):
	if len(temp)==n:
		res.append(temp)
		return
	for i in range(1,n+1):
		if not used[i-1] and not k:
			used[i-1]=True
			helper(n,res,temp+[i],used,k-1)
			used[i-1]=False
getPermutation(3,5)