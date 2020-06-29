import numpy as np

at = np.random.randint(0, 9, 10)
at = np.sort(at)
bt = np.random.randint(1, 4, 10)
processes = np.vstack((at, bt)).T
print(processes)

print("ending times : ")
ct = 0
wt = 0
for i in range(0, processes.shape[0]):
	if ct > processes[i][0]:
		wt += (ct-processes[i][0])
		ct = ct+processes[i][1]
	else:
		ct = processes[i][0]+processes[i][1]
	print(ct)
print("average waiting time in seconds : ")
print(wt/(processes.shape[0]))