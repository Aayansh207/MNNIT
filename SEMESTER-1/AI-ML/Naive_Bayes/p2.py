import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import LabelEncoder, StandardScaler
from sklearn.naive_bayes import GaussianNB

data = pd.read_csv("churn.csv")
if 'customerID' in data.columns:
    data = data.drop('customerID', axis=1)
if 'TotalCharges' in data.columns:
    data['TotalCharges'] = pd.to_numeric(data['TotalCharges'], errors='coerce')
numeric_cols = data.select_dtypes(include=np.number).columns
data[numeric_cols] = data[numeric_cols].fillna(data[numeric_cols].mean())

X = data.drop('Churn', axis=1)
y = data['Churn']

label_encoders = {}
for col in X.columns:
    if X[col].dtype == 'object' or X[col].dtype.name == 'category':
        le = LabelEncoder()
        X[col] = le.fit_transform(X[col].astype(str))
        label_encoders[col] = le

target_encoder = LabelEncoder()
y = target_encoder.fit_transform(y.astype(str))

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

scaler = StandardScaler()
X_train_scaled = scaler.fit_transform(X_train)

model = GaussianNB()
model.fit(X_train_scaled, y_train)

print("Enter new customer details to predict churn:")
input_data = {}
for col in X.columns:
    if col in label_encoders:
        options = list(label_encoders[col].classes_)
        print(f"{col} options: {options}")
        val = input(f"Enter {col}: ")
        val_str = str(val)
        if val_str not in label_encoders[col].classes_:
            label_encoders[col].classes_ = np.append(label_encoders[col].classes_, val_str)
        input_data[col] = int(label_encoders[col].transform([val_str])[0])
    else:
        val = input(f"Enter {col} (numeric): ")
        input_data[col] = float(val)

user_df = pd.DataFrame([input_data], columns=X.columns)
user_scaled = scaler.transform(user_df)
pred = model.predict(user_scaled)

if pred[0] == 1:
    print("\nPrediction: The customer is likely to CHURN.")
else:
    print("\nPrediction: The customer is NOT likely to churn.")

