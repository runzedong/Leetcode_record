def simplifypath(path):
	stack=[]
	simple_path=''
	start=0
	end=1
	while end<len(path):
		if path[end]!='/':
			end+=1
			print('if level')
			continue
		else:
			if path[start+1:end]=='..':
				if stack:
					stack.pop()
			elif path[start+1:end] and path[start+1:end]!='.':
				stack.append(path[start+1:end])
			start=end
			end+=1
	if stack:
		for n in stack:
				simple_path=simple_path+'/'+n
	else:
		simple_path='/'
	print(stack)
	print(simple_path)
#simplifypath('////a/./b////..//../c/')
simplifypath('/home')
#simplifypath('/home/foo/')

