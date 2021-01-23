
print ("=============++++POSTFIX Operation========____++_\n")

##def postfix(data):
##     stack = []
##     for x in data:
##         stack.append(x)
##     for y in range(0,len(stack)):
##                if "*" == stack[y]:
##                      temp = stack[y-1]
##                      temp1= stack[y-2]
##                      data = int(temp)*int(temp1)
##                      stack.remove(stack[y])
##                      stack.append(str(data))
##                      stack.remove(temp)
##                      stack.remove(temp1)
##                      print (stack)
##                      break
##     for x in range(len(stack)):
##             if "+" == stack[x]:
##                 temp = stack[x-1]
##                 temp1 = stack[x+1]
##                 data= int(temp)+int(temp1)
##                 stack.remove(stack[x])
##                 stack.remove(temp)
##                 stack.remove(temp1)
##                 stack.append(str(data))
##                 print ("[+] Ans is ==>{}".format(stack))
##                 break

class Postfix:


	def __init__(self):
		self.top = -1
##		self.capacity = capacity
		self.array = []


	def isEmpty(self):
		return True if self.top == -1 else False


	def peek(self):
		return self.array[-1]


	def pop(self):
		if not self.isEmpty():
			self.top -= 1
			return self.array.pop()
		else:
			return "$"


	def push(self, op):
		self.top += 1
		self.array.append(op)



	def evaluatePostfix(self, exp):


		for i in exp:


			if i.isdigit():
				self.push(i)

			else:
				val1 = self.pop()
				val2 = self.pop()
				self.push(str(eval(val2 + i + val1)))

		return int(self.pop())



if __name__ =="__main__":
    data = raw_input("input Postfix Formate for Calculate==>")
    result = Postfix()
    print (result.evaluatePostfix(data))
