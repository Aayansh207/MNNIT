import numpy as np
import numpy as np
arr = np.array([5, 2, 8, 1])
print("Original:", arr)
arr = np.append(arr, 9)
print("Append:", arr)
arr = np.insert(arr, 2, 7)
print("Insert:", arr)
arr = np.delete(arr, 1)
print("Pop:", arr)
arr = np.delete(arr, np.where(arr == 8))
print("Remove 8:", arr)
print("Index of 7:", np.where(arr == 7)[0][0])
arr.sort()
print("Sorted:", arr)
arr = arr[::-1]
print("Reversed:", arr)

