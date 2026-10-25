f=open("A1.txt","r")
words=f.read().split()
set1=set(words)
for i in sorted(set1):
	print(i)
f.close()

