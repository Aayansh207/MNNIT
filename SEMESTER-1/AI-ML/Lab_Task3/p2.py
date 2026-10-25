import math
import cmath

def add(a, b):
    return a + b
def subtract(a, b):
    return a - b
def multiply(a, b):
    return a * b
def divide(a, b):
    if b == 0:
        return "Error: Division by zero!"
    return a / b

def math_operations(x, y):
    print("\n--- Math Module Operations (for real numbers) ---")
    print("Ceiling value of", x, ":", math.ceil(x))
    print("Exponential value of", x, ":", math.exp(x))
    print("GCD of", int(x), "and", int(y), ":", math.gcd(int(x), int(y)))

def complex_operations(z1, z2):
    print("\n--- CMath Module Operations (for complex numbers) ---")
    print("Tangent of", z1, ":", cmath.tan(z1))
    print("Log base 10 of", z1, ":", cmath.log10(z1))
    print("Are both complex numbers approximately equal?:", cmath.isclose(z1, z2))

print("===== Smart Calculator =====")
choice = input("Do you want to use complex numbers? (y/n): ").lower()

if choice == 'y':
    a = complex(input("Enter first complex number (e.g., 2+3j): "))
    b = complex(input("Enter second complex number (e.g., 1+4j): "))
    print("\n--- Basic Operations ---")
    print("Addition:", add(a, b))
    print("Subtraction:", subtract(a, b))
    print("Multiplication:", multiply(a, b))
    print("Division:", divide(a, b))
    complex_operations(a, b)

else:
    a = float(input("Enter first number: "))
    b = float(input("Enter second number: "))
    print("\n--- Basic Operations ---")
    print("Addition:", add(a, b))
    print("Subtraction:", subtract(a, b))
    print("Multiplication:", multiply(a, b))
    print("Division:", divide(a, b))
    math_operations(a, b)

