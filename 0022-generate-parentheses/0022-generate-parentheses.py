class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        result = set()
        
        def generate(current, open_count, close_count):
            if len(current) == 2 * n:
                result.add(current)
                return
            if open_count < n:
                generate(current + '(', open_count + 1, close_count)
            if close_count < open_count:
                generate(current + ')', open_count, close_count + 1)
        
        generate('(', 1, 0)
        return list(result)