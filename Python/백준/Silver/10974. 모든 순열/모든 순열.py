from itertools import permutations

N = int(input())
R = [i for i in range(1, N + 1)]
check = [False] * N
choose = []

for permutation in permutations(range(1, N + 1)):
    print(*permutation)

# def permutation(level):
#     if level == N:
#         return print(*choose)
    
#     for i in range(0, N):
#         if check[i] == True:
#             continue

#         choose.append(R[i])
#         check[i] = True

#         permutation(level + 1)

#         check[i] = False
#         choose.pop()

# permutation(0)
            