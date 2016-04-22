def getpermutation(n,k):
	"""
	:type n:int
	:type k: int
	:rtype :str
	"""
	res=[]
	nums=[]
	k-=1
	factorial=1

	for i in range(2,n):
		factorial*=i
	for j in range(1,n+1):
		nums.append(j)
	loop=n-1
	while loop>=0:
		index=k//factorial
		res.append(nums[index])
		nums.remove(nums[index])
		k%=factorial
		if loop:
			factorial//=loop
		loop-=1
	return ''.join(str(n) for n in res)
print(getpermutation(3,5))
