import numpy as np

a = np.array([1, 2, 3])
b = a
c = a.view()
d = a.copy()
a[0] = 99
print("a:", a)
print("b (assign):", b)
print("c (shallow):", c)
print("d (deep):", d)

