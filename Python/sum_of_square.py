def judgeSquareSum(c):
	# two pointer to find the lef and right numbers. otherwise return False.
	left = 0
	right = indSqrtInt(c)
	while left <= right:
		currentSum = left * left + right * right
		if currentSum < c:
			left += 1
		elif currentSum > c:
			right -= 1
		else:
			return True
	return False

def findSqrtInt(num):
	"""
	: type num: int
	: rtype: Boolean
	"""
	# newtown method to get square guess -> is good enough -> guess
	guess = num
	while guess * guess > num:
		guess = (guess + num // guess) // 2
	return guess

def main():
	print judgeSquareSum(3)

if __name__ == '__main__':
	main()