def moore_vote(nums):
	#let's try to find top2 frequency numbers
	m,n,cm,cn=0,0,0,0
	for x in nums:
		if x==m:
			cm+=1
		elif x==n:
			cn+=1
		elif cm==0:
			m=x
			cm=1
		elif cn==0:
			n=x
			cn=1
		else:
			cm-=1
			cn-=1
	print(m,n)
def moore_vote_single(nums):
	#just to find top freq nums
	m,cm=0,0
	for i in range(len(nums)):
		if nums[i]==nums[m]:
			cm+=1
		else:
			cm-=1
			if cm==0:
				m=i
				cm=1
	print(nums[m])

def main():
	nums=[1,2]
	print('the lenght is',len(nums))
	contfor3=0
	contfor9=0
	for n in nums:
		if n==3:
			contfor3+=1
		if n==9:
			contfor9+=1
	print('contfor3->',contfor3,'contfor9->',contfor9)
	moore_vote_single(nums)
	print('#######################')
	moore_vote(nums)
main()
		