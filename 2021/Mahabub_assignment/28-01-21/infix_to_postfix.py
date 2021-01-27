
print ("-------==infix to postfix==-------")

def infixtopostfix(data):
       stack = []
       for x in data:
           if  "^" in x:
               y = stack[stack.index("^")-1]
               stack.append(stack.index("^"))







if __name__ == "__main__":
    data = raw_input("[+] Input a infix Expression===>")
    infixtopostfix(data)