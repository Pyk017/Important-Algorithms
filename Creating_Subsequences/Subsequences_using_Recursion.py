def subsequences(string):
    if len(string) == 1:
        return [string]
    subs = subsequences(string[1:])
    return [string[0]+i for i in subs] + subs + [string[0]]


input_string = input("Enter String :- ")
print(subsequences(input_string))
