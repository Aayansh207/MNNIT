students = {}
n = int(input("Enter number of students: "))
for i in range(n):
    name = input(f"Enter name of student {i+1}: ")
    percentage = float(input(f"Enter percentage of {name}: "))
    students[name] = percentage
print("\nStudent Information:")
for name, percentage in students.items():
    print(f"Name: {name}, Percentage: {percentage}%")

