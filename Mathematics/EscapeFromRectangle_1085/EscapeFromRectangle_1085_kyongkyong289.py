#This function finds minimum distance to escape
def escape_minimum(x, y, w, h):
    #Declaring varirables
    horizontal_distance = 0
    vertical_distance = 0
    
    #Finding horizontal and vertical distance
    horizontal_distance = min(w - x, x)
    vertical_distance = min(h - y, y)
    
    #Returning minimum of them
    return min(horizontal_distance, vertical_distance)

#Input part
x, y, w, h = map(int, input().split())
answer = 0

#Applying algorithm
answer = escape_minimum(x, y, w, h)

#Output part
print(answer)