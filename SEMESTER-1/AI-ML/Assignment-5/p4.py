def add(a,b): return a+b
def sub(a,b): return a-b
def mul(a,b): return a*b
def div(a,b): return a/b
a = float(input("Enter a: "))
b = float(input("Enter b: "))
op = input("Op (+ - * /): ")
if op == '+': print(add(a,b))
elif op == '-': print(sub(a,b))
elif op == '*': print(mul(a,b))
elif op == '/': print(div(a,b))
else: print("Invalid")

