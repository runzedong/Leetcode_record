def findsubstring(s,words):
	"""
	:type s:str
	:type words:List[str]
	:rtype List[int]
	"""
	count=0
	dic={}
	ans=[]
	for word in words:
		if word not in dic:
			dic[word]=1
			count+=1
		else:
			dic[word]+=1
	length=len(words[0])
	for i in range(length):
			left=0
			right=0
			while s[right:right+length] in dic and right<len(s):
				dic[s[right:right+length]]-=1
				if dic[s[right:right+length]]==0:
					count-=1
					if count==0:
						ans.append(left)
						break
				right+=length
			while left<right:
				if s[left:left+length] in dic:
					if dic[s[left:left+length]]
			
				#恢复原样dic
				i+=length



