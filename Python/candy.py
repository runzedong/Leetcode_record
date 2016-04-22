def findcandy(ratings):
	"""
	:type ratings: LIST[int]
	:rtypr: int
	"""
	print(ratings)
	n=len(ratings)
	nums=[1 for i in range(n)]
	ans=0
	#from left
	for i in range(1,n):
		if ratings[i]>ratings[i-1]:
			nums[i]=nums[i-1]+1
		else:
			nums[i]=1
	print(nums)
	#from right
	for j in range(n-2,-1,-1):
		curr=1
		if ratings[j]>ratings[j+1]:
			curr=nums[j+1]+1
		nums[j]=max(curr,nums[j])
	print(nums)
	print(sum(nums))
findcandy([0,1,0,2,1,0,3,2,1,2])