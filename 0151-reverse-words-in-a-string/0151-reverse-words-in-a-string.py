class Solution:
    def reverseWords(self, s: str) -> str:
        words = [word for word in s.split(' ') if word]
        rev = words[::-1]
        return ' '.join(rev)