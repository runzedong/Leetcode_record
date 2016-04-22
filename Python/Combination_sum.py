class Solution(object):
	def combinationSum(self, candidates, target):
		def recur(candidates, target, res, pre):
			for i in range(len(candidates)):
				if i>0 and candidates[i]==candidates[i-1]:
						print('get repeat, continue loop')
						continue
				print('the index i is ***%d'%i)
				if target < candidates[i]:
					print('loop break') 
					break
				elif target == candidates[i]:
						print('the pre+now num is ***',pre+[target])
						res.append(pre + [target])
				else:
					#if i>0 and candidates[i]==candidates[i-1]:
					#	print('get repeat, continue loop')
					#	continue
					print('now the next recursive candi is***',candidates[i:])
					print('the target is now ***%d',target-candidates[i])
					recur(candidates[i+1:], target - candidates[i], res, pre + [candidates[i]])
		res = []
		candidates.sort()
		recur(candidates, target, res, [])
		return res
c=Solution()
candidates=[1,2,7,6,1,5,10]# already sorted
target=8
print(c.combinationSum(candidates,target))
