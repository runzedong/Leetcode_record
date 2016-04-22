def reversebit(n):
	ans=0
	for i in range(32):
		print('loop for',i,n)
		digit=n>>i&1
		ans<<=1
		ans=ans|digit
	return ans
def main():
	n=43261596
	print(reversebit(n))
main()
