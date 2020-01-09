#Finding number of hansu which is under n
def number_of_hansu(n):
    out = 0
    digit_difference = 0

    for i in range(1, n + 1):
        #Number under 100 is always hansu
        if i < 100:
            out += 1

        else:
            #First digit difference
            digit_difference = digits(i)[1] - digits(i)[0]
            for j in range(len(digits(i)) - 1):
                #If digits are different
                if digits(i)[j + 1] - digits(i)[j] != digit_difference:
                    break
                #If the number is hansu
                if j == len(digits(i)) - 2:
                    out += 1

    #Returning value
    return out  

#Finding digits of n
def digits(n):
    digit = []
    while n > 0:
        digit += [n % 10]
        n = n // 10
    digit.reverse()
    return digit

#Input part
N = int(input())
answer = 0

#Applying algorithm
answer = number_of_hansu(N)

#Output part
print(answer)