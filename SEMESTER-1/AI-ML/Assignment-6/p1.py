import pandas as pd
from sklearn.model_selection import train_test_split
df=pd.read_csv('titanic.csv')
print(df.head())
 
missing_values=df.isnull().sum()
print("\nMissing values in each column:")
print(missing_values)
df=df.drop(['Name', 'Ticket', 'Cabin'], axis=1)
print("\nData after dropping unnecessary columns:")
print(df.head())
df['Sex']=df['Sex'].map({'male':1,'female':0})
print("\nData after converting 'male' to 1 and 'female' to 0:")
print(df.head())
df['Age']=df['Age'].fillna(df['Age'].median())
print("\nData after filling missing values in 'Age' column:")
print(df.head())
X=df.drop('Survived',axis=1)
y=df['Survived']

print("\nInput (X) and Output (y) columns split:")
print("Input (X):")
print(X.head())
print("Output (y):")
print(y.head())
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)
print("\nData split into train and test sets:")
print(f"Training Data (X_train):\n{X_train.head()}")
print(f"Testing Data (X_test):\n{X_test.head()}")

