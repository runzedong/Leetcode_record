class Solution(object):
   
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        if not n:
            return []
        res=[]
        str=''
        self.makepairParenthesis(n,0,0,res,str)
        return res
        
    def makepairParenthesis(self, n, left, right,res,str):
        if right==n:
            res.append(str)
        else:
            if right<left:
                str=str+')'
                self.makepairParenthesis(n,left,right+1,res,str)
            if left<n:
                str=str+'('
                self.makepairParenthesis(n,left+1,right,res,str)
    n=2
    answer=generateParenthesis(n)
    print(answer)                