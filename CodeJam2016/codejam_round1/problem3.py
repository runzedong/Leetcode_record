def solution(bflist):
	
	return len(bflist)
	
def main():
	t=int(input()) #read a line with a single integer
	for i in range(1,t+1):
		n=int(input())
		bflist=input().split()
		res=solution(bflist)
		print("Case #{}: {}".format(i,res)) 
main()