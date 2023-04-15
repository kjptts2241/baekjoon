n = int(input()) # 별 개수 입력

# n을 3으로 나눈 나머지가 1, n을 3으로 나눈 몫이 1
# 위의 경우가 아니라면 star 리스트를 그대로 채우는 함수
def stars(n):
    sList = [] # 빈 리스트 생성
    for i in range(3 * len(n)): # count 횟수만큼 증가
        if i // len(n) == 1:
            sList.append(n[i % len(n)] + " " * len(n) + n[i % len(n)])
        else:
            sList.append(n[i % len(n)] * 3)
    return (list(sList))

star = ['***', '* *', '***'] # 초기값이 3일 경우의 함수 없이 출력
count = 0 # 함수 호출 횟수

# 3의 거듭제곱 일때 (9, 27, ...) 마다 count 증가
while n != 3:
    n = int(n / 3)
    count += 1

# 함수 호출 후 저장
for i in range(count):
    star = stars(star)

for i in star:
    print(i)
