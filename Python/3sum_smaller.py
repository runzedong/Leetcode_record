def threesum_small(nums,target):
	nums.sort()
	counter=0
	length=len(nums)
	for i in range(length-2):
		l=i+1
		r=length-1
		while l<r:
			sum_three=nums[i]+nums[l]+nums[r]
			if sum_three<target:
				counter+=(r-l)
				l+=1
			else:
				r-=1
	return counter

print(threesum_small([3,2,-2,6,2,-2,6,-2,-4,2,3,0,4,4,1],3))