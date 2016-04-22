def subset(nums):
	res=[]
	res.append([])
	for i in range(len(nums)):
		for j in range(len(res)):
			temp=res[j]+[nums[i]]
			res.append(temp)
	print(res)
subset([1,2,3])