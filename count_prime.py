def countPrimes(n):
    """
    :type n: int
    :rtype: int
    """
    nums = [1 for i in range(n)]
    for i in range(n if n < 2 else 2):
        nums[i] = 0 # 0 represents NOT prime
    baseNum = 2
    while baseNum * baseNum < n:
        if nums[baseNum]:
            time = baseNum
            while time * baseNum < n: #here we start to mark off from baseNum^2, check hint No.5
                nums[time * baseNum] = 0
                time += 1
        baseNum += 1
    #count prime number from the list
    return sum(nums)

def main():
    print countPrimes(1500000)

if __name__ == '__main__':
    main()