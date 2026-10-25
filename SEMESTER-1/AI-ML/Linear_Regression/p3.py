import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.linear_model import LinearRegression
sns.set(style="whitegrid")
data=pd.read_csv("iris.csv")
X=data[['petal_length']]
y=data['petal_width']

model=LinearRegression()
model.fit(X,y)

predicted=model.predict(pd.DataFrame({'petal_length': [1.5]}))
print("Predicted Width = ",predicted)

plt.figure(figsize=(10, 6))
plt.scatter(X,y,color='blue',label='Actual Width')
plt.plot(X,model.predict(X),color='red',linewidth=2,label="Regression Line")
plt.scatter(pd.DataFrame({'petal_length': [1.5]}),predicted,s=150,zorder=5,color='green',label='Predicted Point')
plt.title('Length vs Width')
plt.xlabel('Length')
plt.ylabel('Width')
plt.legend()
plt.grid(True)
plt.savefig("Iris_plot.png")
print("Plot saved as Iris_plot.png")



