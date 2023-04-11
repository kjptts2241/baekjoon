import sys
input = sys.stdin.readline


left = [] # 왼쪽 스택
right = [] # 오른쪽 스택

left = list(input()) # 받은 문자열 쪼개서 저장
left.pop() # \n 제외

m = int(input()) # 명령어 갯수 입력

for i in range(m):
    cmd = list(input().split()) # split() -> p 명령어 나누기

    if cmd[0] == 'L':
        if left:
            right.append(left.pop()) # 왼쪽으로 커서 옮기기
    elif cmd[0] == 'D':
        if right:
            left.append(right.pop()) # 오른쪽으로 커서 옮기기
    elif cmd[0] == 'B':
        if left:
            left.pop() # 커서 왼쪽 문자 제거
    elif cmd[0] == 'P':
        left.append(cmd[1]) # 커서 왼쪽 문자 추가

print(''.join(left + list(reversed(right)))) # 오른쪽 스택 뒤집어 주고 join