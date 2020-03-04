start = list(map(int, input("Enter starting points of Activities :- ").rstrip().split()))
finish = list(map(int, input("Enter finishing points of Activities :- ").rstrip().split()))
obj = [i+1 for i in range(len(start))]
new_list = sorted(zip(obj, start, finish), key=lambda x: x[2])
result = list()
result.append(1)
j = 0
for i in range(1, len(new_list)):
    if new_list[i][1] >= new_list[j][2]:
        result.append(new_list[i][0])
        j = i

print("Resulting activities are :- {}".format(' '.join(list(map(str, result)))))

# Sample Inputs :-
# 1 2 3 4 7 8 9 9 11 12
# 3 5 4 7 10 9 11 13 12 14
