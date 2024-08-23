T = int(input())

for _ in range(T):
    # 스택 활용, 여는괄호와 닫는괄호가 쌍을 이루어야하는 점을 활용
    stk = []
    isVPS = True
    
    for ch in input():
        if ch == '(':
            stk.append(ch)
        else:
            if len(stk) > 0:   
                # 스택이 비어있을 때 괄호 한쌍을 pop으로 없애준다
                stk.pop()
            else:
                isVPS = False
                break    

    if len(stk) > 0:
        isVPS = False    
        
    print("YES" if isVPS else "NO")    
 