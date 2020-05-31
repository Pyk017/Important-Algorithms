def common_substring(X, Y, m, n):
    mat = [[0 for _ in range(n + 1)] for _ in range(m + 1)]
    result = 0
    for i in range(m + 1):
        for j in range(n + 1):
            if i == 0 or j == 0:
                mat[i][j] = 0
            elif X[i - 1] == Y[j - 1]:
                mat[i][j] = mat[i - 1][j -1] + 1
                result = max(result, mat[i][j])
            else:
                mat[i][j] = 0
                
    return result
    
    
X = input()
Y = input()
print(common_substring(X, Y, len(X), len(y)))
