class Solution:
    def capitalizeTitle(self, title: str) -> str:
        arr = title.split(" ")
        s = ""
        for i in arr:
            if len(i) <= 2:
                s += i.lower()+" "
            else:
                s += i[0].upper()+i[1:].lower()+" "
        return s[:len(s)-1]