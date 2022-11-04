class Solution:
    def commonFactors(self, a: int, b: int) -> int:
        if a == 1 and b == 1:
            return 1
        a_c = [1, a]
        b_c = [1, b]
        for i in range(2, a//2+1):
            if a%i == 0:
                a_c.append(i)
        for i in range(2, b//2+1):
            if b%i == 0:
                b_c.append(i)
        count = 0
        print(a_c, b_c)
        for i in a_c:
            if i in b_c:
                count += 1
        return count