import cv2
import numpy

img = cv2.imread('/Users/tech4GT/Desktop/Images/mario.png')
# msg = "Secret"
# size = (bin(len(msg)*8)[2:]).zfill(8)
val = 45
size = bin(val)[2:].zfill(8)

print(val)

for x in range(8):
    val = int(size[x])
    item = img.item(0, x, 0)
    if(val == 0):
        item = item & 254
    else:
        item = item | 1
    img.itemset((0, x, 0), item)

cv2.imshow('img', img)
cv2.waitKey(0)
cv2.destroyAllWindows()

ans = ""

for x in range(8):
    item = img.item(0, x, 0)
    ans = ans + str(item % 2)
ans = int(ans, 2)
print(ans)
