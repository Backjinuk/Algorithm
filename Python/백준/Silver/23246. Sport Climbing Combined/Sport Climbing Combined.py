N = int(input())

player = {
            int(a): (
                int(b) * int(c) * int(d),     
                int(b) + int(c) + int(d)     
            )
            for a,b,c,d in 
            ( input().split() for _ in range(N)) 
        }

print(" ".join(
       str(k) for k, v in sorted(
           player.items(), key=lambda item : (item[1][0], item[1][1], item[0])
           ) [:3]
       )
    )