def maxSubArrayLen(nums, k):
	"""
	:type nums:list[int]
	:type k: int
	:rtype: int
	"""
	max_len=0
	temp=k
	for i in range(len(nums)):
		for j in range(i,len(nums)):
			for n in nums[i:j+1]:
				temp=temp-n
			if temp==0 and max_len<j+1-i:
				max_len=j+1-i
			else:
				temp=k
	return max_len
def maxSub_hashset(nums,k):
	dic={0:-1}# key is acc value, value is index
	ans,acc=0,0
	for i in range(len(nums)):
		print('the dic is ',dic)
		acc+=nums[i]
		if acc not in dic:
			dic[acc]=i
		if acc-k in dic:
			ans=max(ans,i-dic[acc-k])
			print('ans %d'%ans)
	return ans
def main():
	nums=[3,-1,1,0,0]
	k=0
	print(maxSub_hashset(nums,k))
main()


