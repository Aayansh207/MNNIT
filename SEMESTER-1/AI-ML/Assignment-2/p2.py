def test_list(l1,l2):
    return l1==l2
list1=[]
list2=[]
print("For list 1")
n1=int(input("Enter the length of list : "))
for i in range(n1):
    list1.append(int(input(f"Enter the {i+1} element : ")))
print("List 1 completed")
print("For list 2")
n2=int(input("Enter the length of list : "))
for i in range(n2):
    list2.append(int(input(f"Enter the {i+1} element : ")))
print("list 2 completed")
print("Final output : ",test_list(list1,list2))
