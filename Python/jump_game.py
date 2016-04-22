def jump(nums):
	size=len(nums)
	last_reach,reach,count,best=0,0,0,0
	step=[]
	for i in range(size):
		print('index nums',i)
		print('last reach is',last_reach)
		if i>last_reach:
			last_reach=reach
			count+=1
			step.append(best)
			print('jump tracker=>',step)
			print('jump count=>',count)
		if nums[i]+i>reach:
			reach=nums[i]+i
			best=i
			print("where we can reach",reach)
	return step
def main():
	nums=[2,3,1,1,4]
	jump(nums)

main()