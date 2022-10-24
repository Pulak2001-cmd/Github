class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        x = 0
        i = 0
        while(x < n):
            x = pow(2, i)
            i += 1
            if x == n:
                return True
        return False