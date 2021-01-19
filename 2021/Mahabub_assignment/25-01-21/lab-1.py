print ("-----+++++ Implement Stack in With User Input +++++------\n")

def implement_stack(data):
     stack = []
     for x in data:
        stack.append(x)
     if stack:
       try:
        def push_pop():
          print ("-"*10)
          print ("1) Press One For pop")
          print ("2) Press Two For Push")
          print ("3) Press Three For See Current Element in Stack")
          print ("4) Press Four for See Len of Stack ")
          print ("-"*10)
          choose  = input("Chosse===>")
          if choose == 1:
             print("-"*10)
             data = input("input index For pop From Stack===>")
             try:
              stack.pop(data)
              print ("[++] After Drop Your  index {} Now Stack ===> {}".format(data,stack))
             except:
                print ("[+] Stack Seem To empty")
             push_pop()
          elif choose==2:
            print("-"*10)
            data = input("input Any thing in Stack(use Comma)===> ")
            for x in data:
                stack.append(x)
            print ("[++] After insert Your {} Stack ===>{} ".format(data,stack))
            push_pop()
          elif choose==3:
            print ("-"*10)
            print ("[+] Now Current stack is ===>{}".format(stack))
            push_pop()
          elif choose==4:
            print ("-"*10)
            print ("[+] Your Stack Length is ===>{}".format(len(stack)))
            push_pop()
          else:
            print("-"*10)
            print("[???] input Valide Choose")
            push_pop()
       except Exception as msg:
          print("[!] Some Thing Went Wrong Because ===>{}".format(msg))
     push_pop()



if __name__ == "__main__":
    data = input("[+] input data in to the Stack(Use Comma)====>")
    try:
     implement_stack(data)
    except:
        print ("[!!!!] Your Stack Run into under Flow ")
        implement_stack(data)