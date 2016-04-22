def solution(lista):
	dic={}
	result=[]
	for element in lista:
		if element not in dic:
			dic[element]=1
		else:
			dic[element]+=1
	for key in dic.keys():
		if dic[key]%2 is 1:
			result.append(key)
	return sorted(result)
def main():
	result=''
	t=int(input()) #read a line with a single integer
	for i in range(1,t+1):
		n=int(input())
		res=[]
		for j in range(n*2-1):
			res+=[int(n) for n in input().split()]
		for e in solution(res):
			result+=str(e)
			result+=' '
		print("Case #{}: {}".format(i,result))
		result=''
main()