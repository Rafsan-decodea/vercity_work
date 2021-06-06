class Node:
    def __init__(self, dataval=None):
        self.dataval = dataval
        self.nextval = None

class SLinkedList:
    def __init__(self):
        self.headval = None

    def add_data(self, newdata):
        NewNode = Node(newdata)
        if self.headval is None:
            self.headval = NewNode
            return
        laste = self.headval
        while(laste.nextval):
            laste = laste.nextval
        laste.nextval=NewNode

    def Remove(self, Removekey):

        HeadVal = self.head

        if (HeadVal is not None):
            if (HeadVal.data == Removekey):
                self.head = HeadVal.next
                HeadVal = None
                return

        while (HeadVal is not None):
            if HeadVal.data == Removekey:
                break
            prev = HeadVal
            HeadVal = HeadVal.next

        if (HeadVal == None):
            return

        prev.next = HeadVal.next

        HeadVal = None

    def  ShowAll_data(self):
        printval = self.headval
        while printval is not None:
            print (printval.dataval)
            printval = printval.nextval



def start():
   print ("="*5,"Studnet Management System","="*5)
   print ("1)Add Studnet Details ")
   print ("2)Delete Student Details")
   print ("3)Update Studnet Details ")
   print ("4)See Student ")
   print ("="*50)
   choose = input("choose===>")

   if choose == "1":
      print ("\n")
      stuid = input("[+] Studet id===>")
      stuname = input("[+]Studnet Name ==>")
      stufather_name = input("[+]studnet Father Name===>")
      stumother_name = input("[+]studnet Mother name ===>")
      stu_dataofbirth = input("[+]stu date of birth ==>")
      linking  = SLinkedList()
      m_stuid = "[+] Studnet id ==>{}".format(stuid)
      linking.headval = Node(m_stuid)
      m_stuname = "[+] Studnet Name ==>{}".format(stuname)
      ln_stuname= Node(m_stuname)
      m_stufather_name = "[+] Student Father Name ===>{}".format(stufather_name)
      ln_stufathername = Node(m_stufather_name)
      m_stumother_name = "[+] Student Mother Name ==>{}".format( stumother_name)
      ln_stumothername = Node(m_stumother_name)
      m_studateofbith = "[+] Student Date of Birth ===>{}".format(stu_dataofbirth)
      ln_studataofbirth = Node(m_studateofbith)
      linking.headval.nextval = ln_stuname
      ln_stuname.nextval = ln_stufathername 
      ln_stufathername.nextval = ln_stumothername
      ln_stumothername.nextval = ln_studataofbirth
      print ("\n[+]Data Recoded Success\n")
      print ("*"*10)
      linking.ShowAll_data()
      print ("\n")
      start()




if  __name__ == "__main__":
    start()




