def count(a,m,n):
    if n is 0:
        return 1
    if n < 0:
        return 0
    if m <= 0 and n >= 1:
        return 0
    return count(a, m-1, n) + count(a, m, n-a[m-1])

n = int(input("Enter total number of Coins :- "))
print("Enter types of Coins")
a = [int(input()) for i in range(n)]
m = int(input("Enter total Denomination :- "))
print("Result is :- {}".format(count(a,n,m)))