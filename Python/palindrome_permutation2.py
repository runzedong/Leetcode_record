def generatePalindrome(s):
	if not s:
		return []
	dic={}
	odd_numbers=0
	odd_element=[]
	for n in s:
		if n not in dic:
			dic[n]=1
		else:
			dic[n]+=1
	for n in dic:
		if dic[n]%2==0:
			continue
		else:
			odd_numbers+=1
			odd_element.append(n)
			print(odd_element)
			if odd_numbers>1:
				return []
	for n in dic:
		dic[n]//=2
	

print(generatePalindrome('aabbcd'))