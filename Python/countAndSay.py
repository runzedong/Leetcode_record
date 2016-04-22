class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        if n==0: return ''
        if n==1: return '1'
        res='1'
        for n in range(2,n+1):
            temp=''
            prev=res[0]
            conunt=1
            for i in range(1,len(res)):
                if prev==res[i]:
                    count+=1
                else:
                    temp+=(str(count))+prev
                    prev=res[i]
                    count=1
            res=temp
        return res
            