from itertools import permutations

# 질문 갯수 (조건 수)
N = int(input())

line = [input().split() for _ in range(N)]
answer = 0


for num in permutations(range(1,10),3):
    num_str = ''.join(map(str, num))
    check = True

    for a, b, c in line:
        st= sum(num_str[i] == a[i] for i in range(3))

        bl = sum((digit in a) for digit in num_str) - st

        if(st != int(b) or bl != int(c)):
            check = False
            break
    if check :
        answer += 1;

print(answer)