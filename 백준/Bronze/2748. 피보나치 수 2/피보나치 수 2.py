arr = [-1]*91
arr[0] = 0
arr[1] = 1

def f_numbers(n):
    if arr[n] == -1:
        arr[n] = f_numbers(n-1)+f_numbers(n-2)

    return arr[n]


print(f_numbers(int(input())))