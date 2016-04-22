def sortcolor(nums):
	print(nums)
	indx0=0
	indx1=0
	for i in range(len(nums)):
		if nums[i]==0:
			nums[i]=2
			nums[indx1]=1
			nums[indx0]=0
			indx1+=1
			indx0+=1
			print('get one 0',nums,'indx0 now is ',indx0)
		elif nums[i]==1:
			nums[i]=2
			nums[indx1]=1
			indx1+=1
			print('get one 1',nums,'indx1 now is ',indx1)
	print(nums)
sortcolor([0,0,0,2,2,2,2])