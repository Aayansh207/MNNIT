import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.linear_model import LinearRegression
from sklearn.metrics import r2_score
sns.set(style="whitegrid")
data=pd.read_csv("iris.csv")
X=data[['sepal_length']]
y=data['sepal_width']

model=LinearRegression()
model.fit(X,y)

y_pred=model.predict(X)
r2 = r2_score(y, y_pred)
print("R2 Score is : ",r2)
plt.figure(figsize=(10, 6))
plt.scatter(X,y,color='blue',label='Actual Width')
plt.plot(X,model.predict(X),color='red',linewidth=2,label="Regression Line")
plt.title('Length vs Width')
plt.xlabel('Length')
plt.ylabel('Width')
plt.legend()
plt.grid(True)
plt.savefig("Iris_plot2.png")
print("Plot saved as Iris_plot2.png")



