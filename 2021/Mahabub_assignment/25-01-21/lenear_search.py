print ("-----Lnear Search-----")

def leaner_search(data):
    list = []
    for x in data:
        list.append(x)
    print ("[##] data is recorded .. Now Search Data in Record")
    search_data = input("[+]Input for Search data in record==>")
    for x in list:
        print x
        if search_data in x:
           print ("[+] Your input ({}) data is found in ({}) this Record ".format(search_data,x))
        else:
           print("[!!!] Your input ({}) data Is NOT found in ({}) this recoderd ".format(search_data,x))

if __name__ == "__main__":
   data = raw_input("[+]input data For Store ===>").split(',')
   leaner_search(data)