class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        c = 0
        
        
    
        for i in range(1,len(s)):
            while s[i] in s[l:i]:
                l += 1
            
                
            if i - l + 1 > c:
                c = i - l + 1
            
        return c if len(s) >= 2 else len(s)
        
        
                


            

            
            
            
        
        
        
        
        
        
