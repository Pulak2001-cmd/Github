class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        x = math.sqrt(num)
        x = int(x)
        return x*x == num