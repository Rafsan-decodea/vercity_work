
class Node:
    def __init__(self,value):
         self.next = None
         self.prev = None
         self.value = value


class DobuleList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def add(self,value):
        node = Node(value)
        if self.tail is None:
             self.head = node
             self.tail = node
             self.size += 1
        else:
            self.head.next = node
            node.prev = self.head
            self.size +=1

    def __str__(self):
        vals = []
        node = self.head
        while  node is not None:
            vals.append(node)
            node = node.next
        return f"[{', '.join(str(val) for val in vals)}]"


my_list = DobuleList()

my_list.add(1)
my_list.add(2)
my_list.add(3)

print (my_list)





