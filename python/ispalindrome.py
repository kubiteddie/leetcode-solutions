class Solution:
    def isPalindrome(self, x: int) -> bool:
        if(x < 0):
            return False;
        r = 0
        original = x
        while(x > 0):
            rem = x%10
            r = r * 10 + rem
            x = x//10
        return original == r