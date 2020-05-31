def KadaneAlgo(a):
    max_current = max_global = a[0]
    c, d = 0, 0
    for i in range(1, len(a)):
        if a[i] < max_current + a[i]:
            max_current = a[i]
            c = i
        else:
            max_current = max_current + a[i]
        #max_current = max(a[i], max_current + a[i])
        if max_current <= max_global:
            d = i
            max_global = max_current
    print(c, d)
    return max_global


n = int(input("Enter the Range :- "))
a = list(map(int, input().split()))
#a = [int(input("Enter {} element :- ".format(i+1))) for i in range(n)]
print(" Maximum Sum of the Sub-array of Array is :- {}".format(KadaneAlgo(a)))
