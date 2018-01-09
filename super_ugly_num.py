def nthSuperUglyNumber(n, primes):
    """
    :type n: int
    :type primes: List[int]
    :rtype: int
    """
    factoryList = [0] * len(primes)

    #
    #This isn't a efficient way to solve this problem since we don't need to calculate the pending list each time
    #we only update the position when one of the pending numbers get selected. direclty update after that.
    #
    
    uglyNums = [1]
    while n > 1:
        pendingUglyNums = list(map(lambda t: t[0] * t[1] ,zip(map(lambda index: uglyNums[index], factoryList), primes)))
        newUglyNum = min(pendingUglyNums)
        uglyNums.append(newUglyNum)

        for i in range(len(pendingUglyNums)):
            if pendingUglyNums[i] == newUglyNum:
                factoryList[i] += 1
        n -= 1
    return uglyNums[-1]

def main():
    n = 100000
    p = [7,19,29,37,41,47,53,59,61,79,83,89,101,103,109,127,131,137,139,157,167,179,181,199,211,229,233,239,241,251]
    print nthSuperUglyNumber(n, p)

if __name__ == '__main__':
    main()