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
             else :
                if stack[y] == "*":
                   temp = stack.index(stack[y])-1
                   temp1= stack.index(stack[y])
                   data = temp*temp1
     print (stack.index(stack[y])-1)
     print stack[y]
     print stack.index(stack[y])
     print data , hi








if __name__ =="__main__":
    data = raw_input("input Postfix Formate for Calculate==>").split(' ')
    postfix(data)