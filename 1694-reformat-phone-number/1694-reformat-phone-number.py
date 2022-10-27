class Solution:
    def reformatNumber(self, number: str) -> str:
        digits = number
        digits = digits.replace(" " , "")
        digits = digits.replace("-","")
        res = []
        i = 0
        while i < len(digits)-4:
            res.append(digits[i:i+3])
            i = i + 3
        if len(digits[i:]) == 4:
            res.append(digits[i:i+2])
            res.append(digits[i+2:])
        else:
            res.append(digits[i:])
        return "-".join(res)