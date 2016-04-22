def two_diff(array, k):
	"""
	:array, list[int]
	:k, int
	:rtype>int
	"""
	dic={}
	res=0
	for i in range(len(array)):
			dic[array[i]-k]=i+1
			print(dic)
	for n in array:
		if n in dic:
			res+=1
	return res

def main():
	k=2
	array=[3,5,2,4,1,4]
	answer=two_diff(array,k)
	print(answer)
main()
