n = int(input()) # 원판 개수 입력

def hanoi(n, start, end):
    if n == 1: 
        print(start, end)
        return
    hanoi(n-1, start, 6-start-end) # n-1개의 원판을 가운데 기둥으로 이동
    print(start, end) # 가장 큰 원판을 마지막 기둥으로 이동
    hanoi(n-1, 6-start-end, end) # 가운데 기둥의 n-1개의 원판을 마지막 기둥으로 이동

print(2**n-1) # 옮긴 횟수
hanoi(n, 1, 3)