def bin_search (a,target,lb,ub):

    while lb <= ub:
        mid = (lb + (ub-1)) // 2
        if a[mid] is target:
            return mid
        if target < a[mid]:
            ub = mid - 1
        else:
            lb = mid + 1
    return -1

n = int(input("Enter range of the Array :- "))
a = [int(input("Enter element at index position {} :- ".format(i)))  for i in range(n)]
target = int(input("Enter element to be seached in the Array :- "))
sorted(a)
if bin_search(a,target,0,n-1) is -1:
    print ("Element not Found!")
else :
    print ("Your Element {} fount at index position {}.".format(target,bin_search(a,target,0,n-1)))