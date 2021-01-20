print ("=============++++POSTFIX Operation========____++_\n")

def postfix(data):
     stack = []
     for x in data:
         stack.append(x)
     for y in range(len(stack)):
             if stack[y].isdigit() !=True :
                if stack[y] == "*":
                      temp = stack[y-1]
                      temp1= stack[y-2]
                      data = int(temp)*int(temp1)
                      stack.remove(stack[y])
                      stack.append(str(data))
                      stack.remove(temp)
                      stack.remove(temp1)
                      print (stack)
                elif stack[y] =="+":
                    pass





if __name__ =="__main__":
    data = raw_input("input Postfix Formate for Calculate==>").split(' ')
    postfix(data)
