class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        res=""
        if len(s)==1: return s
        for i in range(len(s)):
            temp=self.find(s,i,i)
            if len(temp)>len(res):
                res=temp
            temp=self.find(s,i,i+1)
            if len(temp)>len(res):
                res=temp
        return res
    def find(self, s, l, r):
        while l>=0 and r<len(s) and s[l]==s[r]:
            l-=1
            r+=1
        return s[l+1:r]