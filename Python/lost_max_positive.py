def firstMissingPositive(nums):
	"""
	:type nums:list[int]
	:rtype: int
	"""
	temp=0
	if len(nums)==0:
		return 1
	i=0
	while i<len(nums):
		print("now the i is%d"%i)
		if nums[i]>0 and nums[i]<=len(nums) and nums[nums[i]-1]!=nums[i]:
			temp=nums[i]
			nums[i]=nums[nums[i]-1]
			nums[nums[i]-1]=temp
			print("nums[i] is %d"%nums[i])
			print("nums[nums[i]-1] is %d"%nums[nums[i]-1])
			print("after if statement i is%d"%i)
			print("the nums is",nums)
		i+=1
	print(nums)
	for i in range(len(nums)-1):
		if nums[i]!=i+1:
			return i+1
	return len(nums)+1

def main():
	nums=[3,4,-1,1]
	answer=firstMissingPositive(nums)
	print(answer)
main()
