print ("-----+++++ Implement Stack in With User Input +++++------")

def implement_stack(data):
     list = []
     for x in data:
        list.append(x)
     if list:
        def push_pop():
          print ("1) Press One For pop")
          print ("2) Press Two For Push")
          print ("---------------------")
          choose  = input("Chosse===>")
          if choose == 1:
             data = input("input index For pop From Stack===>")
             list.pop(data)
             print list
             push_pop()
          elif choose==2:
            data = input("input Any thing in Stack===> ")
            list.append(data)
            print ("[++] After Drop Your {} index ===>".format(data,list))
            push_pop()
          else:
            print("[???] input Valide Choose")
            push_pop()
     push_pop()



if __name__ == "__main__":
    data = input("[+] input data in to the Stack(Use Commad)====>")
    try:
     implement_stack(data)
    except:
        print ("[!!!!] Your Stack Run into under Flow ")
        implement_stack(data)