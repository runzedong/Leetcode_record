#input() reads a string with a line of input, stripping the \n at the end
def solution(n):
	"""
	:type n: int
	:rtype : int
	"""
	if n is 0:
		return 0
	else:
		dic={}
		count=0
		base=n
		while True:
			temp=n
			while temp:
				digit=temp%10
				if digit not in dic:
					dic[digit]=1
					count+=1
					if count is 10:
						return n
				temp//=10
			n+=base

def main():
	t=int(input()) #read a line with a single integer
	for i in range(1,t+1):
		n=int(input())
		res=solution(n)
		if res is 0:
			print("Case #{}: {}".format(i,"INSOMNIA"))
		else: 
			print("Case #{}: {}".format(i,res)) 
main()