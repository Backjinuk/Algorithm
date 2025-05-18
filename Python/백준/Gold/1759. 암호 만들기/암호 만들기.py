from itertools import combinations

def is_vowel(ch):
    return ch in "aeiou"

def is_consonact(ch):
    return not is_vowel(ch)


S = input().split()         # "5 3" 이런 식으로 입력받음
R = int(S[1])
N = int(S[0])               # 조합의 개수
arr = input().split(" ")       # 예: "1 2 3 4 5"
arr.sort()


for comb in combinations(arr, N):
    str = ""
    vowelCount = 0
    consonactCount = 0
    for u in comb:
        str += u
        if(is_vowel(u)):
            vowelCount += 1
        if(is_consonact(u)):
            consonactCount += 1

    if(vowelCount >= 1 and consonactCount >= 2): 
        print(str)
    else:
        continue
print()
