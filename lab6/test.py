from __future__  import print_function
import math
def solve():
   num = input("input===>")
   vagses = 0
   for _ in str(num):
       vagses = (vagses*10)+ (num%10)  #reverseing  number From Input
       num =  num/10 #  store num in input
   a = [int(x) for x in reversed(str(vagses))] #De-reversing NUmber
   m = (math.pow(a[0],3)+math.pow(a[1],3)+math.pow(a[2],3)) #For Armstrong
   i = int(m)  # int in Armstronf
   if sum(a)==i:
      print ("{} This is a Amstrong Number ".format(a))
   else:
        print("{} this is not a Amstrong number ".format(a))

if __name__ =="__main__":
   solve()