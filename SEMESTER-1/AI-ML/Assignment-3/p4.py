a = int(input("Enter first side: "))
b = int(input("Enter second side: "))
c = int(input("Enter third side: "))
sides = sorted([a,b,c])
if sides[0]**2+sides[1]**2==sides[2]**2:
    print("It is a right-angled triangle.")
else:
    print("It is NOT a right-angled triangle.")

