from collections import deque
print ("--------Plindrome Quuee Operation Using DQUEE--------")


def palindrome(data):
    stack = deque([])
    for x in data:
        stack.appendleft(x)
    if stack[0] == stack[len(stack)-1]:
        print ("Palindrome")
    else:
        print ("Not Palinedrmoe")


if __name__ == "__main__":
    data = raw_input("input your data===>")
    palindrome(data)
