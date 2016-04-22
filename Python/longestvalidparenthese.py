class Solution(object):
    def longestValidParentheses(self, s):
        """
        :type s: str
        :rtype: int
        """
        res=0
        start=-1
        stack=[]
        if len(s)==0: return 0
        for i in range(len(s)):
            print(i)
            if s[i]=='(':
                stack.append(i)
                print(stack)
            else:
                if stack:
                    stack.pop()
                    print(stack)
                    if len(stack)==0:
                        print('older res %d',res)
                        res=max(res,i-start)
                        print('this is stack empty condition %d',res)
                    else:
                        print('older res %d',res)
                        res=max(res,i-stack[len(stack)-1])
                        print('this is stack peek condition %d',res)
                else:
                    start=i
                    print('the new start is %d',start)
                    #stack.append(s[i])
        print(res)
s='))))((()(('
c=Solution()
c.longestValidParentheses(s)
