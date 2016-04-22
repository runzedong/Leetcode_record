class Solution:
	def twosum(self, nums, target):
		map={}
		for i in range(0,len(nums)):
				if nums[i] not in map:
					map[target-nums[i]]=i+1
				else:
					return map[nums[i]],i+1
		return -1,-1 

nums=[3,2,4]
target=6
Solution answer
Solution.twosum(answer,nums,target)