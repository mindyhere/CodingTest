dic = dict()

for _ in range(int(input())):
    book = input()
    if book in dic :
        dic[book] += 1
    else :     
        dic[book] = 1


m = max(dic.values())
arr = []

for k, v in dic.items():
    if v == m : 
        arr.append(k)

arr.sort()
print(arr[0])   