class Solution:
    def maxLength(self, arr: List[str]) -> int:
        dp = [set()]

        for i in arr:
            chars = set(i)

            if len(chars) < len(i):
                continue

            dp.extend(chars | other for other in dp if not (chars & other))

        return max(map(len, dp))