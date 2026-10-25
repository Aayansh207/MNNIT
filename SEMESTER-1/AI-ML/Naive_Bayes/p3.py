import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.naive_bayes import MultinomialNB

data = pd.read_csv("movies.csv", encoding='utf-8', on_bad_lines='skip')

print(data.head())

if 'review' not in data.columns or 'sentiment' not in data.columns:
    data.columns = ['review', 'sentiment']

X_train, X_test, y_train, y_test = train_test_split(
    data['review'], data['sentiment'], test_size=0.2, random_state=42
)

vectorizer = TfidfVectorizer(stop_words='english', max_features=5000)
X_train_tfidf = vectorizer.fit_transform(X_train)

model = MultinomialNB()
model.fit(X_train_tfidf, y_train)

review = input("Enter a movie review: ")
review_tfidf = vectorizer.transform([review])
prediction = model.predict(review_tfidf)

print("Predicted Sentiment:", prediction[0].upper())

