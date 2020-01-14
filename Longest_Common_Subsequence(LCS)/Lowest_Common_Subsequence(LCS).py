def lcs(fs, ss):
    matrix = [[0 for _ in range(len(ss)+1)] for _ in range(len(fs)+1)]
    for i in range(len(fs)+1):
        for j in range(len(ss)+1):
            if i == 0 or j == 0:
                matrix[i][j] = 0
            elif fs[i-1] == ss[j-1]:
                matrix[i][j] = 1 + matrix[i-1][j-1]
            else:
                matrix[i][j] = max(matrix[i-1][j], matrix[i][j-1])

    i, j = len(fs), len(ss)
    string = ''
    while i > 0 and j > 0:
        if fs[i-1] == ss[j-1]:
            string = fs[i-1] + string
            i -= 1
            j -= 1
        elif matrix[i-1][j] >= matrix[i][j-1]:
            i -= 1
        else:
            j -= 1

    print("Matrix is :- ")
    print_matrix(matrix)
    return string


def print_matrix(mat):
    for i in mat:
        for j in i:
            print(j, end=' ')
        print()


fstr = input("Enter First String :- ")
sstr = input("Enter Second String :- ")
print("Lowest Common Subsequence is :- {}".format(lcs(fstr, sstr)))
