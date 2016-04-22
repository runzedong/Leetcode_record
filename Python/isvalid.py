def isValid(s):
	stack=[]
	if s[0] is ')' or s[0] is ']' or s[0] is '}':
		return False
	for n in s:
		if n is '(' or n is '[' or n is '{':
			stack.append(n)
		else:
			if stack:
				temp=stack.pop()+n
				print(temp)
				if temp not in ['()','[]','{}']:
					return False
			else:
				stack.append(n)
	return stack==[]

print(isValid("([[]])"))