def CountingSort(a):
    l = [0]*(max(a) + 1)
    for i in a:
        l[i] += 1
    l2 = []
    for i in range(len(l)):
        if l[i] != 0:
            for j in range(l[i]):
                l2.append(i)

    return l2

n = int(input("Enter Range = "))
a = [int(input("Enter element {} = ".format(i+1))) for i in range(n)]
print("Before Sorting :- ")
for i in a: print(i,end=" ")
a = CountingSort(a)
print("\nAfter Sorting :- ")
for i in a: print(i,end=" ")