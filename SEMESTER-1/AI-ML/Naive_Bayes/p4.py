import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.naive_bayes import GaussianNB

data = pd.read_csv("diabetes.csv")

X = data.drop('Outcome', axis=1)
y = data['Outcome']

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

scaler = StandardScaler()
X_train_scaled = scaler.fit_transform(X_train)

model = GaussianNB()
model.fit(X_train_scaled, y_train)

pregnancies = int(input("Enter number of pregnancies: "))
glucose = float(input("Enter glucose level: "))
bp = float(input("Enter blood pressure: "))
skin = float(input("Enter skin thickness: "))
insulin = float(input("Enter insulin level: "))
bmi = float(input("Enter BMI: "))
dpf = float(input("Enter Diabetes Pedigree Function: "))
age = int(input("Enter age: "))

user_input = pd.DataFrame([[pregnancies, glucose, bp, skin, insulin, bmi, dpf, age]], columns=X.columns)
user_input_scaled = scaler.transform(user_input)

prediction = model.predict(user_input_scaled)

if prediction[0] == 1:
    print("The patient is likely to have the disease.")
else:
    print("The patient is NOT likely to have the disease.")

