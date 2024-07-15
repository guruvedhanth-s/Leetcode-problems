class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        def backtrack(path, remaining):
            if len(path) == len(nums):
                result.append(path[:])
                return
            for i in range(len(remaining)):
                path.append(remaining[i])
                backtrack(path, remaining[:i] + remaining[i+1:])
                path.pop()

        result = []
        backtrack([], nums)
        return result   