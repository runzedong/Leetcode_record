def nthUglyNumber(n):
    """
    :type n: int
    :rtype: int
    """
    uglyNums = [1]
    u2, u3, u5 = 0, 0, 0
    while n > 1:
        new2, new3, new5 = uglyNums[u2] * 2, uglyNums[u3] * 3, uglyNums[u5] * 5
        print "----origin select-----"
        print u2
        print u3
        print u5
        print "----------"

        newUglyNume = min(new2, new3, new5)
        uglyNums.append(newUglyNume)
        if new2 == newUglyNume: u2 += 1
        if new3 == newUglyNume: u3 += 1
        if new5 == newUglyNume: u5 += 1

        print "---after select---"
        print u2
        print u3
        print u5
        print "----------"
        n -= 1
    return uglyNums[-1]

def main():
    print nthUglyNumber(10)

if __name__ == '__main__':
    main()