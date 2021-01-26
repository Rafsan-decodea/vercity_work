print ("=============++++POSTFIX Operation========____++_\n")

class Postfix:
    def __init__(self):
		self.top = -1
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
			return  1
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
    data = raw_input("input Postfix Formate for Calculate(use Space)==>").split(' ')
    result = Postfix()
    print ("------\n[+]Result ==>{}".format(result.evaluatePostfix(data)))




