class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n == 1:
            return True
        while(n >= 1):
            if n % 3 != 0:
                return False
            x = n
            n = n // 3
            if n == 1 and x % 3 == 0:
                return True
        return False