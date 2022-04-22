class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
         # turns array into a set and checks to see if the size is the same.
        return len(set(nums)) != len(nums)     