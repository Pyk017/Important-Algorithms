def KadaneAlgo(a):
    max_current = max_global = a[0]
    for i in range(1, len(a)-1):
        max_current = max(a[i], max_current + a[i])
        if max_current > max_global:
            max_global = max_current
    return max_global


n = int(input("Enter the Range :- "))
a = [int(input("Enter {} element :- ".format(i+1))) for i in range(n)]
print(" Maximum Sum of the Sub-array of Array is :- {}".format(KadaneAlgo(a)))
