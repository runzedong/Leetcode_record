def countPrime(n):
	count=0
	for i in range(n):
		print(i,isPrime(i))
		if isPrime(i):
			count+=1
	return count

def isPrime(num):
	if num<2:
		return False
	else:
		i=2
		while i*i<=num:
			if num%i==0:
				return False
			i+=1
		return True
def main():
	countPrime(6)

main()