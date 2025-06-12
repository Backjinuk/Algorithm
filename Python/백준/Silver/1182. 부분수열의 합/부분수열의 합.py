import sys
from itertools import combinations

input = sys.stdin.read
data = input().split()

N = int(data[0])
S = int(data[1])
arr = list(map(int, data[2:]))

count = 0

for r in range(1, N + 1):
    for comb in combinations(arr, r):
        if sum(comb) == S:
            count += 1

print(count)