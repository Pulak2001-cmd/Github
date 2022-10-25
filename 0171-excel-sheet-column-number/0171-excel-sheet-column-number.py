class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        x = 0
        j = 0
        for i in columnTitle[::-1]:
            x += (ord(i.lower())-96)*pow(26, j)
            j += 1
        return x