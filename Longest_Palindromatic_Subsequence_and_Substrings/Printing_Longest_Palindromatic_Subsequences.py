def lcs(X, Y):
    n = len(X)
    ls = [[0] * (n + 1)] * (n + 1)
    for i in range(n + 1):
        for j in range(n + 1):
            if i == 0 or j == 0:
                ls[i][j] = 0
            elif X[i - 1] == Y[j - 1]:
                ls[i][j] = ls[i - 1][j - 1] + 1
            else:
                ls[i][j] = max(ls[i - 1][j], ls[i][j - 1])

    ind = ls[n][n]
    seq = [''] * (ind + 1)
    i, j = n, n
    while i > 0 and j > 0:
        if X[i - 1] == Y[j - 1]:
            seq[ind - 1] = X[i - 1]
            i -= 1
            j -= 1
            ind -= 1
        elif ls[i - 1][j] > ls[i][j - 1]:
            i -= 1
        else:
            j -= 1

    ans = ''.join(seq)
    return ans


def lps(S):
    _s = S[::-1]
    return lcs(S, _s)


string = input('Enter String :- ')
print('The Length of the Longest Palindromatic Subsequence in the String is :- ', lps(string))
# bbabcbcab
