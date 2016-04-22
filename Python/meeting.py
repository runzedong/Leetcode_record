class Interval(object):
	def __init__(self,s=0,e=0):
		self.start=s
		self.end=e

class Solution(object):
	def canAttendMeeting(self,interval):
		"""
		:type intervals list[Interval]
		:rtype bool
		"""
		end_time=-1
		interval=sorted(interval, key=lambda x:x.start)
		for n in interval:
			if end_time<n.end:
				end_time=n.end
			else:
				return False
		return True
			
a1=Interval(0,30)
a2=Interval(15,20)
a3=Interval(5,10)
intervals=[a1,a2,a3]
c=Solution()
print(c.canAttendMeeting(intervals))