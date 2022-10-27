class Solution:
    def largestInteger(self, num: int) -> int:
        odds = []
        evens = []
        ordered = []
        final = []
        for x in list(str(num)):
            if int(x) % 2 == 0:
                evens.append(int(x))
                ordered.append("EVEN")
            else:
                odds.append(int(x))
                ordered.append("ODD")
        
        odds = sorted(odds, reverse=True)
        evens = sorted(evens, reverse=True)
        
        for elem in ordered:
            if elem == "ODD":
                final.append(str(odds[0]))
                odds = odds[1:]
            else:
                final.append(str(evens[0]))
                evens = evens[1:]
        return int("".join(final))