print ("-------Binary Search -------")

def binary_search(data):
    global inp_data
    global list
    list = []
    for x in data:
        list.append(x)
    print ("-"*10)
    print ("[+]Record Data in list")
    print ("-"*10)
    inp_data = raw_input("[+] Now Search data ===>")
    last = 0
    high = len(list)-1
    mid = 0
    while last<=high:
        mid = (high+last)//2
        if list[mid] <inp_data:
            last = mid+1
        elif list[mid]>inp_data:
            high=mid-1
        else:
            return mid
    return -1


if  __name__ == "__main__":
     global inp_data
     global list
     data = raw_input("[+] Insert Data (Use Space) ===>").split(' ')
     result = binary_search(data)
     if result != -1:
        print ("#"*10)
        print ("[+] Yes Your input data ({}) is found in ({}) ".format(inp_data,list))
     else:
        print ("!"*10)
        print ("[-] No Your data ({}) is not found in  ({}) ".format(input_data,list))

