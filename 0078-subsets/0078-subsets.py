class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans = [[]]  # Start with the empty subset
        for num in nums:
            # For each num, add it to all existing subsets to create new subsets
            ans += [curr + [num] for curr in ans]
        return ans

    