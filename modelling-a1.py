import numpy as np

A = np.array([[1, 3, 4, 2], [2, 0, 1, 6], [4, 1, 2, 7]])
A
(A.shape[0], A.shape[1])
A.transpose()

B = np.array([[2, 2, 3], [4, 0, 6], [8, 1, 5]])
C = np.array([[1, 1, 2], [6, 3, 5], [1, 9, 1]])
D = B-C 
D
E = B+C
E
F = E+2
F
G = np.matmul(B, C)
G
H = B*C
H

A1 = np.array([2, 7, 6, 8, 9, 10])
A2 = np.array([6, 4, 3, 2, 3, 4])
C1 = A1*B1
C1
D1 = A1/B1
D1

r1 = np.array([7, 3, 5])
s1 = np.array([2, 4, 3])
q1 = np.power(r1, s1)
q1
q2 = np.power(r1, 2)
q2

A = np.array([[1, 3, 4, 2], [2, 0, 1, 6], [4, 1, 2, 7], [0, 3, 6, 4]])
A.diagonal()
A.sum(axis=1)
A.sum(axis=0)
A.sum()
A[1, 2] += 2
