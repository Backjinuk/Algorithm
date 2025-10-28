N ,M = map(int, input().split())

arr = list(map(int, input().split()))

pos = []
neg = []

for i in arr:
    if i > 0:
        pos.append(i)
    else:
        neg.append(-i)

pos = sorted(pos)[::-1]
neg = sorted(neg)[::-1]

disist = []

for i in pos[::M]:
    disist.append(i)

for i in neg[::M]:
    disist.append(i)

print(2 * sum(disist) - max(disist));