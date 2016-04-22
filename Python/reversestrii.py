def reversestr(s):
	# s is a list of char
	helper(s,0,len(s)-1)
	runner=0
	walker=0
	while runner<len(s):
		#print(runner)
		while runner<len(s) and s[runner]!=' ':
			runner+=1
		helper(s,walker,runner-1)
		runner+=1
		walker=runner
	#print('final list')
def helper(s,left,right):
	#input should be a list
	print('subroutine',s)
	while left<right:
		temp=s[right]
		s[right]=s[left]
		s[left]=temp
		left+=1
		right-=1
	print('subroutine',s)
s=['h','e',' ','s','a','i','d',' ','i',' ','a','m',' ','s','k','y']
reversestr(s)