def plusOne(digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        print('lets start it')
        carry=1
        for i in range(0,len(digits)):
            digits[-1-i]=digits[-1-i]+carry
            carry=0
            if digits[-1-i]>=10:
                digits[-1-i]=digits[-1-i]%10
                carry=1
                continue
            if carry==0:
                break
        if carry==1:
            digits.insert(0,1)
            print('the digits after insert is ***',digits)
        return digits
def main():
    digits=[3,4,5]
    result=plusOne(digits)
    print(result)
main()