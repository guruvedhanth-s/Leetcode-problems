class Solution:
    def dividePlayers(self, skill: List[int]) -> int:
        n = len(skill)
        if n % 2 != 0:
            return -1
        
        skill.sort()
        total_skill = skill[0] + skill[n - 1]
        total_score = 0
        
        left, right = 0, n - 1
        while left < right:
            current_skill = skill[left] + skill[right]
            if current_skill != total_skill:
                return -1
            total_score += skill[left] * skill[right]
            left += 1
            right -= 1
        
        return total_score


