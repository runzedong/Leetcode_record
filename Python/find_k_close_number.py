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
    left = 0
    right = len(nums) - k
    while left < right:
        mid = (left + right) // 2
        if n - nums[mid] > nums[mid + k] - n:
            left = mid + 1
        else:
            right = mid
    return nums[left: left + k]

def main():
    num = 34
    k = 5
    nums = [1, 3, 5, 12, 23, 24, 26, 33, 39, 45, 55, 67, 80, 81, 83]
    result1 = find_k_close_nums_op1(k, num, nums)
    result2 = find_k_close_nums_op2(k, num, nums)
    print(result1)
    print(result2)

main()