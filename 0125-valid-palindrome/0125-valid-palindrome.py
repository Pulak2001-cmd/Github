class Solution:
    def isPalindrome(self, s: str) -> bool:
        st = ""
        for i in s:
            if i.isalnum() == True:
                st += i
        rev = st[::-1]
        print(st, rev)
        return st.lower() == rev.lower()