def lps(seq, i, j):
    if i == j:
        return 1

    if seq[i] == seq[j] and i + 1 == j:
        return 2

    if seq[i] == seq[j]:
        return lps(seq, i + 1, j - 1) + 2

    return max(lps(seq, i, j - 1), lps(seq, i + 1, j))


string = input('Enter String :- ')
print('The Length of the Longest Palindromatic Subsequence in the String is :- ', lps(string, 0, len(string) - 1))
# bbabcbcab
