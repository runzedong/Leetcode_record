def find_k_close_nums_op1(k, n, nums): # it's linear O(len(nums) - k)
    left = 0
    right = len(nums) - 1
    while right - left >= k:
        if n - nums[left] > nums[right] - n:
            left += 1
        else:
            right -= 1
    return nums[left:right + 1]

def find_k_close_nums_op2(k, n, nums): # it's binary search O(log(len(nums)))
    pass

def main():
    num = 100
    k = 2
    nums = [1, 3, 5, 12, 23, 24, 26, 33, 39, 45, 55, 67, 80, 81, 83]
    result = find_k_close_nums_op1(k, num, nums)
    print(result)

main()