def common_substring(X, Y, m, n):
    mat = [[0 for _ in range(n + 1)] for _ in range(m + 1)]
    length = 0
    row, col = 0, 0
    for i in range(m + 1):
        for j in range(n + 1):
            if i == 0 or j == 0:
                mat[i][j] = 0
            elif X[i - 1] == Y[j - 1]:
                mat[i][j] = mat[i - 1][j -1] + 1 
                if length < mat[i][j]:
                    length = mat[i][j]
                    row = i
                    col = j
            else:
                mat[i][j] = 0
                
                
    if  length == 0:
        print('No common Substring')
        return
        
    result = [''] * length
    while mat[row][col] != 0:
        length -= 1
        result[length] = X[row - 1]  # or Y[col - 1]
        row -= 1
        col -= 1
                
    return ''.join(result)
    
    
X = input()
Y = input()
print(common_substring(X, Y, len(X), len(Y)))
