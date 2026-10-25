f1=open("A1.txt","r")
f2=open("Output.txt","w")
f2.write(f1.read())
print("Data transferred successfully")
f1.close()
f2.close()

