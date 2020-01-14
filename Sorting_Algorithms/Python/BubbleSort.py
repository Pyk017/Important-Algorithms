n = int(input("Enter Range of the List"))
l = [int(input("Enter {} element".format(i+1))) for i in range(n)]
for i in range(n):
    for j in range(n-i-1):
        if l[j] > l[j + 1]:
                l[j] , l[j+1] = l[j+1] , l[j]

print("Your Sorted List is :- {}".format(l))