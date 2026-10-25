#Name : Aayansh Niranjan
#Reg_No: 20253004
n=int(input("Enter number of boxes: "))
str_boxes=list(input("Enter box weights: ").split())
boxes=[]
for i in str_boxes:
	boxes.append(int(i))
van_type=input("Enter van type (A or B): ")

if van_type=="A":
	for i in range(n-1):
		flag=True
		for j in range(n-i-1):
			if boxes[j]>boxes[j+1]:
				boxes[j],boxes[j+1]=boxes[j+1],boxes[j]
				flag=False
		if flag:
			break

elif van_type=="B":
	for i in range(n-1):
		min_idx=i
		for j in range(i+1,n):
			if boxes[j]<boxes[min_idx]:
				min_idx=j
		boxes[i],boxes[min_idx]=boxes[min_idx],boxes[i]

print("Sorted box weights:",end=" ")
for w in boxes:
    print(w,end=" ")
print()
