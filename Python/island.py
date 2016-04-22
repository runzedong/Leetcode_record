def findIsland(matrix):
	"""
	:type matrix: List[[List[int]]
	:rtype: int
	"""
	if not matrix:
		return 0
	count=0
	for i in range(len(matrix)):
		for j in range(len(matrix[0])):
			if matrix[i][j]==1:
				self.dfs(matrix,i,j)
				count+=1
	return count
	
def dfs(matrix,i,j):
	if i<0 or j>0 or i>=len(matrix)\
	j>=len(matrix[0]) or matrix[i][j]!=1:
		return
		matrix[i][j]=0
		self.dfs(matrix,i+1,j)
		self.dfs(matrix,i,j+1)
		self.dfs(matrix,i-1,j)
		self.dfs(matrix,i,j-1)