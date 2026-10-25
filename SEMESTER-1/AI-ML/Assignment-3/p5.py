num = int(input("Enter a number: "))
digits = str(num)
power = len(digits)
sum_of_powers = sum(int(digit)**power for digit in digits)
if sum_of_powers==num:
    print(num,"is an Armstrong number.")
else:
    print(num,"is NOT an Armstrong number.")

