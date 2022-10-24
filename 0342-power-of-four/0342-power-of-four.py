class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n == 1:
            return True
        while(n >= 1):
            if n % 4 != 0:
                return False
            x = n
            n = n // 4
            print(n , x)
            if n == 1 and x % 4 == 0:
                return True
        return False