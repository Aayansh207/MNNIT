n=int(input())
patients=[]
for i in range(n):
    data = input().split()
    patient_id = data[0]
    priority = int(data[1])
    patients.append([patient_id,priority])
    j=i
    while j > 0 and patients[j][1] < patients[j-1][1]:
    	patients[j-1],patients[j]=patients[j],patients[j-1]
    	j-=1
print("Queue after sorting by priority:")
for p in patients:
    print(p[0],p[1])

