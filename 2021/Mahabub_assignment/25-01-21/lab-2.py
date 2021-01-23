print ("=============++++POSTFIX Operation========____++_\n")

def postfix(data):
     stack = []
     for x in data:
         stack.append(x)
     for y in range(0,len(stack)):
                if stack[y] == "*":
                      temp = stack[y-1]
                      temp1= stack[y-2]
                      data = int(temp)*int(temp1)
                      stack.remove(stack[y])
                      stack.append(str(data))
                      stack.remove(temp)
                      stack.remove(temp1)
                      print (stack)
                      break
     for x in range(len(stack)):
             if "+" in stack[x]:
                 temp = stack[x-1]
                 temp1 = stack[x+1]
                 data= int(temp)+int(temp1)
                 stack.remove(stack[x])
                 stack.remove(temp)
                 stack.remove(temp1)
                 stack.append(data)
                 print ("[+] Ans is ==>{}".format(stack))
                 break


if __name__ =="__main__":
    data = raw_input("input Postfix Formate for Calculate==>").split(' ')
    postfix(data)
