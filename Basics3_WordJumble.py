import random

wordsDict = {'airpods':'listen to music', 'phone': 'call your friends', 'computer': 'use to finish work', 'television': 'watch shows', 'watch': 'check time'}

n = random.randint(0,4)

wordsList = list(wordsDict.keys())

answer = wordsList[n]

checkAns = answer

jumble = ''


for x in range(len(answer)):
    position = random.randint(0,len(answer)-1)
    jumble += answer[position]
    answer = answer[:position] + answer[position+1:]


for x in range(5):
    attempts = 5-x
    print ("you have " + str(attempts) + " left to guess the word!")
    print(jumble)
    print("Hint: " + wordsDict[checkAns])
    reply = input()
    if reply == checkAns :
        print("That is right!")
        break
    else:
        print("Incorrect!")

