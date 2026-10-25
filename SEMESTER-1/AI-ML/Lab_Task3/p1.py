import numpy as np

scores = np.array([45, 60, 72, 51, 89])
print("1. Original scores:", scores)

new_score = 68
scores_added = np.append(scores, new_score)
print("2. After adding", new_score, ":", scores_added)

insert_score = 75
insert_position = 2
scores_inserted = np.insert(scores_added, insert_position, insert_score)
print(f"3. After inserting {insert_score} at index {insert_position}:", scores_inserted)

remove_score = 51
indices = np.where(scores_inserted == remove_score)[0]
if indices.size > 0:
    scores_removed = np.delete(scores_inserted, indices[0])
    print(f"4. After removing {remove_score} (first occurrence):", scores_removed)
else:
    scores_removed = scores_inserted
    print(f"4. Score {remove_score} not found. No removal. Current:", scores_removed)

find_score = 72
positions = np.where(scores_removed == find_score)[0]
if positions.size > 0:
    print(f"5. Position(s) of score {find_score} (0-based indices):", positions.tolist())
else:
    print(f"5. Score {find_score} not found.")

sorted_scores = np.sort(scores_removed)
print("6. Sorted in ascending order:", sorted_scores)

top_scores = sorted_scores[::-1]
print("7. Reversed (top scores first):", top_scores)


