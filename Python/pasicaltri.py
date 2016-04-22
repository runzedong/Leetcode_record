def generate(n):
	res=[[1],[1,1]]
	for i in range(2,n):
		temp=[]
		for j in range(len(res[i-1])-1):
			temp.append(res[i-1][j]+res[i-1][j+1])
		res.append([1]+temp+[1])
	print(res)

def main():
	generate(5)
main()