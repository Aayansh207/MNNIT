import pandas as pd
from PIL import Image
print(pd.read_csv("A2.csv"))
print(pd.read_excel("A4.xlsx"))
print(open("A5.txt").read())
print(pd.read_csv("A3.tsv",sep="\t"))
img=Image.open('image.jpeg')
img.show()

