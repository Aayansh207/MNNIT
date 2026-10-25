import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.linear_model import LinearRegression
sns.set(style="whitegrid")

data = pd.read_csv('house.csv')
X = data[['Size']]
y = data['Price']

model = LinearRegression()
model.fit(X, y)

size_to_predict = pd.DataFrame({'Size': [2100]})
predicted_price = model.predict(size_to_predict)
print(f"Predicted price for a 2100 sq ft house: ${predicted_price[0]:,.2f}")

slope = model.coef_[0]
intercept = model.intercept_
print(f"Model Slope (Price per sq ft): ${slope:.2f}")
print(f"Model Intercept: ${intercept:,.2f}")
print("\nThis means for each additional square foot, the price is expected to increase")

plt.figure(figsize=(10, 6))
plt.scatter(X, y, color='blue', label='Actual Prices')
plt.plot(X, model.predict(X), color='red', linewidth=2, label='Regression Line')
plt.scatter(size_to_predict, predicted_price, color='green', s=150, zorder=5, label='Predicted Point')
plt.title('House Price vs. Size')
plt.xlabel('Size (Square Feet)')
plt.ylabel('Price ($)')
plt.legend()
plt.grid(True)
plt.savefig("house_plot.png")
print("Plot saved as house_plot.png")
print("-" * 40 + "\n")

