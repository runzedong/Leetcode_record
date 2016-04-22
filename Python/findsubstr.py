def findsubstr(s,words):
	"""
	:type s:str
	:type words:list[str]
	:rtype: list[int]
	"""
	if not s or not words：
		return []
	counter={}
	res=[]
	l=len(words[0])
	l_of_words=len(words)
	for n in words:
		if n not in counter:
			counter[n]=1
		else:
			counter[n]+=1
	#test counter initially
	print(counter)

	for i in range(l):
		start=i
		dic={}
		count=0
		for j in range(i,len(s)-l+1,l):
			temp_word=s[j:j+l]
			if temp_word in counter:
				count+=1
				if temp_word not in dic:
					dic[temp_word]=1
				else:
					dic[temp_word]+=1
				while dic[temp_word]>counter[temp_word]:
					dic[s[start:start+l]]-=1
					count-=1
					start+=l
				if count==l_of_words:
					res.append(start)
			else:
				dic={}
				count=0
				start=j+l
	return res
s='sheateateseatea'
words=['sea','tea','ate']
print(findsubstr(s,words))