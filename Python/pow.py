def mypow(x, n):
	"""
	: type x: float
	: type n: int
	: return: float
	"""
	#recursively
	if not n:
		return 1
	if n < 0:
		return 1/mypow(x, -n)
	if n % 2 == 0:
		return mypow(x*x, n/2)
	return x*mypow(x, n-1)

def mypow2(x, n):
	#interactively
	if n < 0:
		n = -n
		x = 1/x
	value = 1
	while n:
		if n & 1：
			value *= x
		x *= x
		n >>= 1
	return value

def main():
	print(mypow2(2, 10))

main()