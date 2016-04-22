def searchInsert(nums, target):
    
    #:type nums:List[int]
    #:type target: int
    #:rtype: int
    
    if not nums: return 0
    if target<=nums[0]: return 0
    if target>nums[len(nums)-1]: return len(nums)
    low=0
    high=len(nums)-1
    mid=int((low+high)/2)
    print("the first mid is ",mid)
    while high-low>1:
        if target==nums[mid]: return mid
        if nums[mid]>target:
            high=mid
            mid=int((low+high)/2)
        else:
            low=mid
            mid=int((low+high)/2)
        print('the while loop + low + mid + high',low,mid,high)
    print("return value high is ",high)
    return high
def main():
    nums=[1,3,5]
    target=2
    ans=searchInsert(nums,target)
    print("the answer is",ans)
main()