def wiggleSort(nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        if len(nums)%2==0:
            max=len(nums)-1
        else:
            max=len(nums)-2
        i=1
        while i<=max:
            if nums[i-1]>nums[i]:
                temp=nums[i]
                nums[i]=nums[i-1]
                nums[i-1]=temp
            if i+1<=len(nums)-1 and nums[i]<nums[i+1]:
                temp=nums[i+1]
                nums[i+1]=nums[i]
                nums[i]=temp
            i+=2

def main():
    nums=[3,5,2,1,6,4]
    print(nums)
    wiggleSort(nums)
    print(nums)
main()