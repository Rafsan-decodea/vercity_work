

print ("-------Curculer Queee Operation------")

def circuler_quee(data,val):
    stack = [] * int(val)
    front = stack[0]
    rear = stack[len(stack)-1]
    if  len(stack)<=int(val):
         pass
    else:
         print ("stack over ")





if __name__ == "__main__":
   val = input("[+]Input your Arry Size==>")
   data = raw_input("[+] input data in Array(use space) ===>").split(' ')
   circuler_quee(data,val)

