print ("-----Lnear Search-----")

def leaner_search(data):
    list = []
    for x in data:
        list.append(x)
    print ("[##] data is recorded .. Now Search Data in Record")
    def run():
     print("-"*10)
     search_data = raw_input("[+]Input for Search data in record==>")
     for x in list:
        if search_data in x:
           print ("[+] Your input ({}) data is found in ({}) this Record ".format(search_data,x))
        else:
           print("[!!!] Your input ({}) data Is NOT found in ({}) this recoderd ".format(search_data,x))
    while 1: run()

if __name__ == "__main__":
   data = raw_input("[+]input data For Store ===>").split(',')

   leaner_search(data)
