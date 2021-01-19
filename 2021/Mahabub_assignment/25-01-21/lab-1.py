print ("-----+++++ Implement Stack in With User Input +++++------")

def implement_stack(data):
     list = []
     for x in data:
        list.append(x)


if __name__ == "__main__":
    data = raw_input("[+] input data in to the Stack(Use Commad)====>".split(","))
    implement_stack(data)