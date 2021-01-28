
print ("------INTER POLATION SEARCH--------")


def interpol(data):
    stack = []
    for x in data:
        stack.append(x)
    def run():
      x = raw_input("[+] Now input number for Search====>")
      if x in stack:
           high = int(stack[len(stack)-1])# Stack high
           low  = int(stack[0]) # Stack low
           pos1 =  0 + (int(x) -int(stack[low-1])) # 8
           pos2 = (int(high)- int(stack[low-1]))#14
           pos3 =  (len(stack))-low #7
           pos4 = (pos2/pos3)# 14/7
           result = (pos1/pos4) # 4
           print ("-"*10)
           print ("[+] Your Search {0} in {1} Where {2} index is {3} ".format(x,stack,x,result))
           run()
      else:
            print ("-"*10)
            print ("[!!] Your {} data is not found in {}".format(x,stack))
            run()

    run()



if __name__ == "__main__":
    data = raw_input("[+] input data  in Stack (Use Space) ===>").split(" ")
    interpol(data)# 1 3 5 7 9 11 13 15