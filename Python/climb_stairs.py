def climb_stairs(n):
	"""
	:type n: int
	:rtype: int
	"""
	f1=1
	f2=2
	if n==1:
		return f1
	if n==2:
		return f2
	for i in range(3,n+1):
		f3=f1+f2
		f1=f2
		f2=f3
	return f3

def main():
	num=5
	print(climb_stairs(num))
main()

