n = int(input("Enter Range of the List"))
l = [int(input("Enter {} element".format(i+1))) for i in range(n)]
for i in range(0,n-1):
    m = min(l[i:])
    ind = l.index(m)
    l[ind],l[i] = l[i],l[ind]

print(l)