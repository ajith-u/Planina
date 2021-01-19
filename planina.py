n=int(input())
if(1<=n<=15):
  x=2
  for i in range(n):
    x+=(x-1)
  print(x*x)
