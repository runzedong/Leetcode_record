def strStr(haystack, needle):
    """
    :type haystack: str
    :type needle: str
    :rtype: int
    """
    if len(needle) is 0:
        return 0
    if len(needle) > len(haystack):
        return -1
    partial_table = [0]*len(needle)
    tableGenerate(partial_table, needle)
    print("the partial_table is following")
    print(partial_table)
        
    i = 0
    j = 0
    n = len(haystack)
    m = len(needle)
    #print ("the length of needle "+str(m))
    while i < n:
        #print (i)
        if haystack[i] == needle[j]:
            print("one digit match at i ="+str(i)+" j ="+str(j))
            if j == m-1:
                print("totally mathc, now return the i "+ str(i))
                return i-m+1
            i += 1
            j += 1
        else:
            print("dismatch found at i ="+str(i)+" j ="+str(j))
            if j != 0:
                j = partial_table[j-1]
                print("find talbe and reset j to "+str(j))
            else:
                i+=1
                print("j equal 0 ! so i ++ "+str(i))
    return -1

def tableGenerate(partial_table, needle):
    pre_len = 0 #length of previous longest suffix-prefix
    partial_table[0] = 0
    i = 1
    while i < len(needle):
        if needle[i] == needle[pre_len]:
            pre_len += 1
            partial_table[i] = pre_len
            i+=1
        else:
            if pre_len != 0:
                pre_len = partial_table[pre_len-1]
            else:
                partial_table[i] = 0
                i += 1 

def main():
    haystack = "aaa"
    needle = "aaa"
    print (strStr(haystack, needle))
    if needle in haystack:
        print ("chek the result truely in str")

main()

