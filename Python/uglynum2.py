class Solution(object):
    def nthUglyNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        ugly[1]*n
        p2=0
        p3=0
        p5=0
        if n==1: return ugly[0]
        for i in range(1,n):
       		ugly[i]=min(ugly[p2]*2, ugly[p3]*3,ugly[p5]*5)
       		if(ugly[i]==ugly[p2]*2):
       			p2++
       		if(ugly[i]==ugly[p3]*3):
       			p3++
       		if(ugly[i]==ugly[p5]*5):
       			p5++
       	return ugly[n]

