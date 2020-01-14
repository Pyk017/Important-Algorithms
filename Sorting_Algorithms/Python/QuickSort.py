def quickSort(a,low,high):
    if low < high:
        mid = Partition(a, low, high)
        quickSort(a, low, mid-1)
        quickSort(a, mid+1, high)

def Partition(a, low, high):
    i, pivot = (low - 1), a[high]
    for j in range(low,high):
        if a[j] <= pivot:
            i += 1
            a[i], a[j] = a[j], a[i]

    a[i+1], a[high] = a[high], a[i+1]
    return i+1

n = int(input("Enter Range = "))
a = [int(input("Enter element {} = ".format(i+1))) for i in range(n)]
print("Before Sorting :- ")
for i in a: print(i,end=" ")
quickSort(a,0,n-1)
print("\nAfter Sorting :- ")
for i in a: print(i,end=" ")