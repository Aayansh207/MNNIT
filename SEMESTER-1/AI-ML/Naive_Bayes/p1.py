import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.naive_bayes import MultinomialNB

data = pd.read_csv("SMSSpamCollection", sep="\t", header=None, names=["label", "message"], encoding="latin-1")
data.columns = ['label', 'message']
data['label'] = data['label'].map({'spam': 1, 'ham': 0})

X_train, X_test, y_train, y_test = train_test_split(data['message'], data['label'], test_size=0.2, random_state=42)

vectorizer = TfidfVectorizer(stop_words='english', max_features=1000)
X_train_tfidf = vectorizer.fit_transform(X_train)
X_test_tfidf = vectorizer.transform(X_test)

model = MultinomialNB(alpha=1.0)
model.fit(X_train_tfidf, y_train)

user_message = input("Enter an email message: ")
user_message_tfidf = vectorizer.transform([user_message])
prediction = model.predict(user_message_tfidf)

if prediction[0] == 1:
    print("This message is classified as: SPAM")
else:
    print("This message is classified as: NOT SPAM")

