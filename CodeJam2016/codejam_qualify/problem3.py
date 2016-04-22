import math
def graycode(n):
	if n<=0:
		return 0;
	res=[]
	res.append('0')
	res.append('1')
	i=2
	while i<(1<<n):
		j=i-1
		while j>=0:
			res.append(res[j])
			j-=1
		j=0
		while j<i:
			res[j]="0"+res[j]
			j+=1
		j=i
		while j<2*i:
			res[j]="1"+res[j]
			j+=1
		i=i<<1
	return res

def isPrime(n,divisor):
	"""
	type n: int
	type divisor: List[int]
	rtype :boolean
	"""
	for i in range(2,n//2+1):
		if n%i is 0:
			divisor.append(i)
			return False
	return True

def converter(base,num_list,N):
	num_convt=0
	for i in range(N)：
		num_convt+=num_list[N-1-i]*pow(base,i)
	return num_convt

def main():
	t=int(input()) #read a line with a single integer
	for i in range(1,t+1):
		N, J=[int(s) for s in input().split(" ")]
		gray_list=graycode(N)
		count_num=0
		divisor=[]
		k=0
		res=[]
		while k<len(gray_list):
			if gray_list[k][0]=='0' or gray_list[k][-1]=='0':
				k+=1
				continue
			else:
				num_list=list(gray_list[k])
				for i in range(2,11):
					if isPrime(converter(i,num_list,N),divisor):
						break
				if len(divisor)==9:
					res.append([''.join(num_list)]+divisor)
					count_num+=1
					if count_num==J:
						break
				k+=1
		print("Case #1:")
		for i in range(len(res)):
			print(res[i])