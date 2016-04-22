def nxtpermutation(nums):
	for i in range(len(nums)-1,-1,-1):
		print('i loop is *********%d'%i)
		if i>0 and nums[i]>nums[i-1]:
			print('******find i position%d'%nums[i])
			print('******find i-1 position%d'%nums[i-1])
			for j in range(len(nums)-1,i-1,-1):
				print(nums[j])
				if nums[j]>nums[i-1]:
					nums[i-1], nums[j]=nums[j], nums[i-1]
					break
			break
		nums[i:]=nums[i:][::-1]

def main():
	list=[2,3,1]
	print('original list is ',list)
	nxtpermutation(list)
	print('the nxt is ',list)
main()