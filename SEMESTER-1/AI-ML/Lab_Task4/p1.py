f=open('A1.txt','r')
ab=f.read()
l1=[]
for i in ab.split():
	if i not in l1:
		l1.append(i)
		
l1.sort()
print("All unique words in the file in alphabetical order")
print(l1)
f.close()
summary=input("Enter the summary you want to save into another file : ")
f=open('summary.txt','w')
f.write(summary)
f.close()

