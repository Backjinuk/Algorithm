def comb(x):
    return x

N = int(input())

coordinates = [tuple(map(int, input().split())) for _ in range(N)]

for x, y in sorted(coordinates, key=lambda x : [x[0], x[1]]):
    print(f"{x} {y}", sep=" ")