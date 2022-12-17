class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        l = 0
        r = 0
        b1 =[None,0]
        b2 =[None,0]
        maxW = 0
        while r < len(fruits):
            if b1[0] == None:
                b1 = [fruits[r],1]
            elif b2[0] == None and fruits[r] != b1[0]:
                b2 = [fruits[r],1]
            
            else:
                if b1[0] == fruits[r]:
                    b1[1] += 1
                elif b2[0] == fruits[r]:
                    b2[1] += 1
                else:
                    while b1[1] != 0 and b2[1] != 0:
                        if fruits[l] == b1[0]:
                            b1[1] -= 1
                        elif fruits[l] == b2[0]:
                            b2[1] -= 1

                        l += 1
                    if b1[1] == 0:
                        b1 = [fruits[r],1]
                    elif b2[1] == 0:
                        b2 = [fruits[r],1]
            
            maxW = max(r - l + 1,maxW)
            r += 1
            
            
            
            
        return maxW

        
        
        