n1,n2=0,1
count=0
print("First 20 Fibonacci numbers:")
while count<20:
    print(n1,end=" ")
    n1,n2=n2,n1+n2
    count+=1
print()
