def solution(s):
	"""
	type n:str
	rtype :int
	"""
	if not s or len(s)==0:
		return 0
	if s[0] is "-":
		dp=1
	else:
		dp=0
	for i in range(1,len(s)):
		if s[i]=="+":
			continue
		else:
			if s[i-1]=="+":
				dp+=2
			else:
				continue
	return dp
def main():
	t=int(input()) #read a line with a single integer
	for i in range(1,t+1):
		s=input()
		res=solution(s)
		print("Case #{}: {}".format(i,res))
main()