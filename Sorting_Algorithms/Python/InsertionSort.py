n = int(input("Enter Range of the List :- "))
l = [int(input("Enter {} element :- ".format(i+1))) for i in range(n)]
for i in range(1,n):
    key = l[i]
    j = i - 1
    while j>=0 and key<l[j]:
        l[j+1] = l[j]
        j -= 1
    l[j+1] = key
    print(l)

print("Sorted Array is :- {}".format(l))
# #  Enter your code here. Read input from STDIN. Print output to STDOUT
# k  = set(map(int, input().split()))
# for i in range(int(input())):
#     set1 = set(map(int, input().split()))
#     set2 = set(map(int, input().split()))
#     if k.intersection(set1) == set1 and k.intersection(set2) == set2:
#         print("True")
#     else:
#         print("False")

