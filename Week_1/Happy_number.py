class Solution:
    def isHappy(self, n: int) -> bool:
        v=set()
        while True:
            v.add(n)
            s=sum([int(i)**2 for i in str(n)])
            n=s
            if s==1:return True
            if s in v:return False