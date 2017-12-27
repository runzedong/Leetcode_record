def isPerfectSquare(num):
	"""
	: type num: int
	: rtype: Boolean
	"""
	# newtown method to get square guess -> is good enough -> guess
	guess = num
	while guess * guess > num:
		guess = (guess + num // guess) // 2
	return guess * guess == num

def main():
	print isPerfectSquare(2147483647)

if __name__ == '__main__':
	main()