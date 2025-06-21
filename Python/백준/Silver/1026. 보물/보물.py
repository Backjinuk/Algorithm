N = int(input())

A = sorted(map(int, input().split()))
B = sorted(map(int, input().split()), reverse=True)

S = 0

for i in range(0, N):
    S += A[i] * B[i]

print(S)