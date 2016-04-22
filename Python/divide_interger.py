class Solution(object):
	def divide(self, dividend, divisor):
		"""
		:type dividend int
		:type divisor int
		:rtype int
		"""
		i=0
		while dividend-divisor>=divisor:
			dividend=-divisor
			i=+1
		return i
	answer=divide(4,2)
	print(answer)