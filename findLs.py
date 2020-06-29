print("Please specify the rate of arrival of processes (lamda) : ")
lamda = int(input())
print("Please specify the rate of service of processes (myu) : ")
myu = int(input())

rho = lamda*1.0/myu
print(" ")
print("rho = ")
print(rho)
print(" ")
if(rho > 1):
	print("Warning : rho should be less than 1")

print("Please specify j to find the value of Pj : ")
j = int(input())
Pj = (rho**j)*(1-rho)
print(" ")
print("Pj = ")
print(Pj)
print(" ")

print("Ls = ")
Ls = rho/(1-rho)
print(Ls)
print(" ")
