from random import *

def find_close_number(target, nums):
    length = len(nums)
    if target < nums[0]:
        return nums[0]
    if target > nums[length - 1]:
        return nums[-1]
    left = 0
    right = length
    mid = 0
    while left < right:
        mid = (left + right) // 2
        if target == nums[mid]:
            return nums[mid]
        elif target < nums[mid]: # if target is less than mid element, search at left half
            if mid > 0 and target > nums[mid - 1]:
                return find_close_number_between_two(nums[mid - 1], nums[mid], target)
            right = mid - 1
        else:
            if mid < length - 1 and target < nums[mid + 1]:
                return find_close_number_between_two(nums[mid], nums[mid + 1], target)
            left = mid + 1

    return nums[mid] #only single element left after search

def find_close_number_between_two(left, right, target):
    if (target - left) > (right - target):
        return right
    else:
        return left

def main():
    sorted_list = [10, 12, 23, 34, 67, 89, 101, 248, 256, 271]
    target_num = randint(0, 300)
    result = find_close_number(target_num, sorted_list)

    print("Target num: ")
    print(target_num)
    print("Source list: ")
    print(sorted_list)
    print("Closest num: ")
    print(result)

main()