import pandas as pd

a2=pd.read_csv('A2.csv')
a3=pd.read_csv('A3.tsv',sep='\t')
a4=pd.read_excel('A4.xlsx')
a5=open("A5.txt",'r').read()

a2.to_csv("output.csv",index=False)
a3.to_csv("output.tsv",sep='\t',index=False)
a4.to_excel("output.xlsx",index=False)
open("output.txt",'w').write(a5)

print("\nA2.csv (first 5 rows):\n",a2.head())
print("\nA3.tsv (first 5 rows):\n",a3.head())
print("\nA4.xls (first 5 rows):\n",a4.head())
print("\nA5.txt (content):\n",a5[:500])
