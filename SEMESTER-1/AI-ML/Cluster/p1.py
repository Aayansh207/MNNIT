import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.preprocessing import StandardScaler
from sklearn.cluster import KMeans
from sklearn.metrics import silhouette_score

df = pd.read_csv('Mall_Customers.csv')

data = df.drop(columns=['CustomerID'])
data['Gender'] = data['Gender'].map({'Male': 0, 'Female': 1})

scaler = StandardScaler()
scaled_data = scaler.fit_transform(data[['Age', 'Annual Income (k$)', 'Spending Score (1-100)']])
scaled_df = pd.DataFrame(scaled_data, columns=['Age', 'Annual Income (k$)', 'Spending Score (1-100)'])

wcss = []
K = range(1, 11)
for k in K:
    model = KMeans(n_clusters=k, random_state=42)
    model.fit(scaled_df)
    wcss.append(model.inertia_)

plt.figure(figsize=(8, 5))
plt.plot(K, wcss, 'bo-')
plt.xlabel('Number of Clusters (k)')
plt.ylabel('WCSS')
plt.title('Elbow Method for Optimal k')
plt.savefig('elbow_plot.png')
plt.close()
print("Elbow plot saved as: elbow_plot.png")

kmeans = KMeans(n_clusters=5, random_state=42)
kmeans.fit(scaled_df)

scaled_df['Cluster'] = kmeans.labels_
data['Cluster'] = kmeans.labels_

plt.figure(figsize=(10, 7))
sns.scatterplot(
    data=scaled_df,
    x='Annual Income (k$)',
    y='Spending Score (1-100)',
    hue='Cluster',
    palette='Set2',
    s=80
)
plt.title('Customer Segments based on Income and Spending')
plt.savefig('cluster_plot.png')
plt.close()
print("Cluster plot saved as: cluster_plot.png")

score = silhouette_score(scaled_df.drop(columns=['Cluster']), scaled_df['Cluster'])
print(f"Silhouette Score: {score:.3f}")

cluster_summary = data.groupby('Cluster')[['Age', 'Annual Income (k$)', 'Spending Score (1-100)']].mean()
print("\nCluster Summary:")
print(cluster_summary)

