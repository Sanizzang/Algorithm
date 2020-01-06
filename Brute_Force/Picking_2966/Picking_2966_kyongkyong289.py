#Function which determine highest score person.
def picking(number_of_problems, exam_answer):
    #Declaring answer variables
    exam_answer_list = list(exam_answer)
    sanggun_answer = ['A', 'B', 'C']
    changyung_answer = ['B', 'A', 'B', 'C']
    hyunjin_answer = ['C', 'C', 'A', 'A', 'B', 'B']

    #Declaring score variables
    sanggun_score = 0
    changyung_score = 0
    hyunjin_score = 0
    high_score = 0

    #Declaring Output
    out = []

    #Calculating number of correct problems
    for i in range(number_of_problems):
        #If the answer is correct
        if sanggun_answer[i % len(sanggun_answer)] == exam_answer_list[i]:
            sanggun_score += 1
        if changyung_answer[i % len(changyung_answer)] == exam_answer_list[i]:
            changyung_score += 1
        if hyunjin_answer[i % len(hyunjin_answer)] == exam_answer_list[i]:
            hyunjin_score += 1

    #Calculating high score
    high_score = max(sanggun_score, changyung_score, hyunjin_score)
    out += [high_score]

    #Adding winners
    if sanggun_score == high_score:
        out += ["Adrian"]

    if changyung_score == high_score:
        out += ["Bruno"]

    if hyunjin_score == high_score:
        out += ["Goran"]

    #Returning value
    return out

#Input part
N = int(input())
input_exam_answer = input()
answer_list = []

#Applying Algorithm
answer_list = picking(N, input_exam_answer)

#Output part
for i in range(len(answer_list)):
    print(answer_list[i])