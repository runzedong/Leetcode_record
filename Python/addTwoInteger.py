def getSum(a, b):
	i = 10
	while b and i > 0:
		carry = a & b
		print("carray is "+str(carry))
		a = a ^ b
		print("a is "+str(a))
		b = carry << 1
		print("new b "+str(b))
		i-=1
	return a

getSum(-1, 1)

