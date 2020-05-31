def count(S, m, n):
    table = [0 for _ in range(n + 1)]
    table[0] = 1
    for i in range(m):
        for j in range(S[i], n + 1):
            table[j] += table[j - S[i]]
            
    return table[n]
    
ar = list(map(int, input().split()))
m = len(ar)
n = int(input())
result = count(ar, m, n)
print(result)