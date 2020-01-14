def subset(a, n, k):
    c = [[False for _ in range(k+1)] for _ in range(n+1)]
    for i in range(n+1):
        for j in range(k+1):
            if j == 0:
                c[i][j] = True
            elif i == 0 and j != 0:
                c[i][j] = False
            elif j < a[i-1]:
                c[i][j] = c[i-1][j]
            else:
                c[i][j] = c[i-1][j-a[i-1]] or c[i-1][j]

    print("Resultant Matrix :- ")
    for i in c:
        for j in i:
            print(j, end="  ")
        print()

    return c[n][k]


n = int(input("Enter a number :- "))
print("Enter elements in the array :- ")
arr = [int(input()) for i in range(n)]
k = int(input("Enter Sum :- "))
print("Subset is Possible!") if subset(arr, n, k) else print("Subset is not Possible!")
