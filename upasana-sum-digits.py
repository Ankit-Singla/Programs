def sum(a):
	b = a%10
	c = a//10

	if(a == 0):
		return 0
	else:
		d = b+sum(c)
		print(d)
		return d

a = int(input())
print(sum(a))