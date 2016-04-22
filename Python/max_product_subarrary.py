def maxProduct(nums):
	global_max=nums[0]
	part_max=nums[0]
	part_min=nums[0]
	size=len(nums)
	for i in range(1,size):
		print("hey i is ",i)
		temp_min=part_min
		temp_max=part_max
		part_min=min(nums[i],temp_max*nums[i],temp_min*nums[i])
		print("hey min is",part_min)
		part_max=max(nums[i],temp_max*nums[i],temp_min*nums[i])
		print("hey max is",part_max)
		global_max=max(global_max,part_max)
		print("hey global is ",global_max)
	return global_max
def main():
	nums=[-4,-3,-2]
	print(maxProduct(nums))
main()