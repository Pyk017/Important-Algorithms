def knapsack(n, c, p, w):
    t = [[0 for i in range(c+1)] for i in range(n+1)]
    for i in range(n+1):
        for j in range(c+1):
            if i == 0 or j == 0:
                t[i][j] = 0
            elif w[i-1] <= j and t[i-1][j-w[i-1]] + p[i-1] > t[i-1][j]:
                t[i][j] = t[i-1][j-w[i-1]] + p[i-1]
            else:
                t[i][j] = t[i-1][j]

    return t[n][c]


n, c = list(map(int, input("Enter Total number of Objects and Total Capacity of the KnapSack :- ").split()))
profit = list(map(int, input("Enter Profits of the Objects :- ").split()))
weight = list(map(int, input("Enter Weights of the Objects :- ").split()))
result = knapsack(n, c, profit, weight)
print("Answer is :- ", result)

