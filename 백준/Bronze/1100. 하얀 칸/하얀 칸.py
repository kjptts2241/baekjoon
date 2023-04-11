import sys
input = sys.stdin.readline


chessBoard = [] # 체스판
count = 0 # 하얀 칸 말 수

# 8개의 체스줄 입력 및 저장
for i in range(8):
    s = input()
    chessBoard.append(list(s))

now = 1 # 체스판 홀수 짝수 구분 변수

for i in chessBoard: # 체스판을 8줄로 나누고
    for j in i: # 한 줄을 다시 나누고
        now += 1
        if now%2 == 0: # 해당 자릿수가 홀수라면
            if j == 'F': # 그리고 문자가 F 라면
                count += 1 # 개수 +1

print(count)