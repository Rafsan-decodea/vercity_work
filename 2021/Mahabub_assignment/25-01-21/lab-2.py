
print ("=============++++POSTFIX Operation========____++_\n")

def postfix(data):
     stack = []
     number = []
     degite = []
     index = []
     for x in data:
         stack.append(x)
     for y in range(0,len(stack)):
             if stack[y].isdigit():
                number.append(stack[y])
             else:
                degite.append(stack[y])
                index.append(stack.index(stack[y]))
     print number
     print degite
     print index




if __name__ =="__main__":
    data = raw_input("input Postfix Formate for Calculate==>").split(' ')
    postfix(data)