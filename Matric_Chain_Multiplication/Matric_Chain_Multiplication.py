import sys


def matric_chain(p, n):
    m = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        m[i][i] = 0
    j, q = 0, 0
    for l in range(2, n):
        for i in range(1, n-l+1):
            j = i+l-1
            m[i][j] = sys.maxsize
            for k in range(i, j):
                q = m[i][k] + m[k+1][j] + (p[i-1] * p[k] * p[j])
                if q < m[i][j]:
                    m[i][j] = q

    return m[1][n-1]


arr = list(map(int, input("Enter Dimentions of the Matrices :- ").rstrip().split()))
print("Minimum Number of Multiplication is :- ", matric_chain(arr, len(arr)))
