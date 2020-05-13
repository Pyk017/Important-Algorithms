def maximum_lis(a):
    mlis = a[:]
    for i in range(1, len(a)):
        for j in range(i):
            if a[i] >= a[j] and mlis[i] < mlis[j] + a[i]:
                mlis[i] = mlis[j] + a[i]

    print(mlis)
    return max(mlis)

def alterantive(a):
    a.sort()
    if a[-1] < 0:
        return a[-1]
    else:
        s = 0
        for i in a:
            if i > 0:
                s += i
        return s
        


ar = list(map(int, input().split()))
res = maximum_lis(ar)
print(res)