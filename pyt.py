# def add(lst, l):
# 	if l==0:
# 		return l
# 	elif lst[l-1]%2==0:
# 		# a=0
# 		# a+=1
# 	else:
# 		return lst[l-1]+add(lst, l-1)


def add(lst, l):
	if l == 0:
		return 0

	lstSum = add(lst, l-1)
	if(lst[l-1]%2 != 0):
		lstSum += lst[l-1]

	return lstSum


lst=[3,7,6,8,5]
l = len(lst)
print(add(lst, l))


