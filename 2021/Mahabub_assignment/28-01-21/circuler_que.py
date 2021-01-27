from __future__ import print_function

print ("-------Curculer Queee Operation------")

def circuler_quee(data,val):
    stack = [] * int(val)
    for x in data:
        stack.append(x)
    front = stack[0]
    rear = stack[len(stack)-1]
    def exe():
      print ("----------===Data Recored===---------")
      print ("1) For Insert Data press 1")
      print ("2) For Delete Data for press 2")
      print ("-"*10)
      chooise  = input("[+]input Choose====>")
      if chooise == 1:
             data = raw_input("[+] OK Now insert type data for insert(Use Space) ==>").split(" ")
             if len(stack)<=int(val):
                for x in data:
                   stack.append(x)
                print ("[+] After Add Stack seems tobea ===>{}".format(stack))
                exe()
             else:
                  print ("-"*10)
                  print ("[!] Stack Over Flow!!!!! Because you Array Size define ==>{}".format(val))
                  exe()
             exe()
      elif chooise ==2:
            if len(stack) != 0:
                del_data = raw_input("[+] Ok now delete data(use space )===>").split(" ")
                for x in del_data:
                    if x not in stack:
                           print ("-"*10)
                           print ("[!!!] Data not Present in Stack")
                           exe()
                    else:
                        stack.remove(x)
                        print ("[+] After Delete Stack seems tobea==>{}".format(stack))
                        exe()
                exe()
            else:
                 print ("Stack is under Flow")
                 exe()
            exe()
      else:
            print ("-"*10)
            print ("!![] Invalide input ")
            exe()
    exe()





if __name__ == "__main__":
   val = input("[+]Input your Arry Size==>")
   data = raw_input("[+] input data in Array(use space) ===>").split(' ')
   circuler_quee(data,val)



