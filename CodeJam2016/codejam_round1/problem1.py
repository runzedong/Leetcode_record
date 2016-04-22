def solution(strs):
	res=[]
	for s in strs:
		if len(res) is 0:
			res.append(s)
		else:
			if res[0]>s:
				res.append(s)
			else:
				res.insert(0,s)
	return ''.join(res)
def main():
	t=int(input()) #read a line with a single integer
	for i in range(1,t+1):
		n=input()
		res=solution(n)
		print("Case #{}: {}".format(i,res)) 
main()