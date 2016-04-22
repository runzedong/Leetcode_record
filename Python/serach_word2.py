def exist(board,words):
	"""
	:type board: List[List[str]]
	:type word: List[str]
	:rtype: bool
	"""
	if not board or len(board)==0 or len(board[0])==0:
		return False
	if not words or len(words)==0:
		return True
	#print('hey we are there')
	row=len(board)
	col=len(board[0])
	#print(row,col)
	res=[]
	used=[[False]*col for i in range(row)]
	for word in words:
		for i in range(row):
			for j in range(col):
				if serach(board,word,0,used,i,j):
					res.append(word)
	return res

def serach(board,word,index,used,i,j):
	if index==len(word):
		return True
	if i<0 or j<0 or i>=len(board) or j>=len(board[0]) or used[i][j] or board[i][j]!=word[index]:
		return False
	used[i][j]=True
	res=serach(board,word,index+1,used,i+1,j) or serach(board,word,index+1,used,i,j+1) or serach(board,word,index+1,used,i-1,j) or serach(board,word,index+1,used,i,j-1)	
	used[i][j]=False
	return res

print(exist(['oaan','etae','ihkr','iflv'],['eat','oath']))
