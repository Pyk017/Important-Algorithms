def lps(s):
    ls = [[0 for _ in range(len(s))] for _ in range(len(s))]
    for i in range(len(s)):
        ls[i][i] = 1

    for cl in range(2, len(s) + 1):
        for i in range(len(s) - cl + 1):
            j = i + cl - 1
            if s[i] == s[j] and cl == 2:
                ls[i][j] = 2
            elif s[i] == s[j]:
                ls[i][j] = ls[i + 1][j - 1] + 2
            else:
                ls[i][j] = max(ls[i][j - 1], ls[i + 1][j])
    return ls[0][len(s) - 1]


string = input('Enter String :- ')
print('The Length of the Longest Palindromatic Subsequence in the String is :- ', lps(string))
# bbabcbcab
