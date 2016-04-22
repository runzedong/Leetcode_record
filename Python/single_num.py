def singleNum(nums):
	res=[0 for i in range(32)]
	print(res)
	target=0
	for i in range(32):
		temp=0
		for n in nums:
			print('hey we shift',n>>i)
			temp+=n>>i & 1
		res[31-i]=temp%3
	print('hey we get res list')
	print(res)
	#for i in range(32):
	#	target+=res[31-i]<<i
	#print (target)

def main():
	singleNum([-2,-2,1,-3,-3,-3,-2])

main()