def knapsack(newlist, m):
    p = 0
    for i in range(len(newlist)):
        if m > 0 and newlist[i][2] <= m:
            m -= newlist[i][2]
            p += newlist[i][1]
        else:
            break

    if m > 0:
        p += (m * (newlist[i][1] / newlist[i][2]))

    return p


def display(newList):
    obj = ' '.join(list(map(str, [i+1 for i in range(len(newList))])))
    print("Objects are :- {}".format(obj))
    profit = ' '.join(list(map(str, [newList[i][1] for i in range(len(newList))])))
    print("Profits are :- {}".format(profit))
    weight = ' '.join(list(map(str, [newList[i][2] for i in range(len(newList))])))
    print("Weights are :- {}".format(weight))
    pw = ' '.join(list(map(str, [newList[i][0] for i in range(len(newList))])))
    print("Profits/Weight ratios are :- {}".format(pw))


n, m = list(map(int, input("Enter Total number of Objects and Total Capacity of the KnapSack :- ").split()))
profit = list(map(int, input("Enter Profits of the Objects :- ").split()))
weight = list(map(int, input("Enter Weights of the Objects :- ").split()))
pw = [i/j for i, j in zip(profit, weight)]
newList = sorted(list(zip(pw, profit, weight)), key=lambda x: x[0], reverse=True)
display(newList)
print("Maximum Profit is :- {}".format(knapsack(newList, m)))
