n = int(input("Enter Range of the Array :- "))
l = [int(input("Enter element at index position {} :- ".format(i))) for i in range(n)]
flag = 0
target = int(input("Enter element to be searched in the array :- "))
for i in range(n):
    if target is l[i]:
        flag += 1
        print("Your Element {} found at index position {} .".format(target,i))

if flag == 0:
    print ("Element not Found!")


