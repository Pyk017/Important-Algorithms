n = int(input("Enter the Range :- "))
a = [int(input("Enter {} element :- ".format(i+1))) for i in range(n)]
b = []

m,p = 0,0
for i in range(0,(n-1)):
    m = p = a[i]
    for j in range(i+1,n):
        p += a[j]
        if m < p:
            m = p

    b.append(m)
    m,p = 0,0

b.append(a[n-1])
print(b)
print (" Maximum Sum of the Subarray of Array is :- {}".format(max(b)))