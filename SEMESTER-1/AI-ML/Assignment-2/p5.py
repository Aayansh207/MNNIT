list1 = []
n1=int(input("Enter the length of list : "))
for i in range(n1):
    list1.append(int(input(f"Enter the {i+1} element : ")))
duplicates = []
for item in list1:
    if list1.count(item) > 1 and item not in duplicates:
        duplicates.append(item)
print("Duplicate elements:", duplicates)