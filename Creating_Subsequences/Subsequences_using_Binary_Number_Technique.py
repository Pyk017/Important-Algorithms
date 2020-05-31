input_string = input('Enter a string :- ')
n = len(input_string)
ls = []
for i in range(1, 2**n):
    test = str(bin(i))[2:][::-1]
    res = ''
    print(test)
    for j in range(len(test)):
        if test[j] == '1':
            res += str(input_string[j])
    

    ls.append(res)

print(ls)
