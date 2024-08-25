n = int(input())
cache = [0]*1001
cache[1] = 1
cache[2] = 2

def fn(m):
    if cache[m] == 0:
        if m > 2:
            cache[m] = fn(m-1) + fn(m-2)
    
    return cache[m]    

print(fn(n) % 10007)