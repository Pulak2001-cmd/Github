class Solution:
    def addDigits(self, num: int) -> int:
        while(num // 10 != 0):
            n = str(num) 
            res = 0
            for i in n:
                res += int(i)
            num = res
        return num