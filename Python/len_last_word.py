def lengthOfLastWord(s):
        """
        :type s: str
        :rtype: int
        """
        list=s.split(' ')
        res=0
        for i in range(len(list)):
            res=len(list[-1-i])
            if res!=0:
                break
        return res
def main():
    s='hello '
    result=lengthOfLastWord(s)
    print(result)
main()