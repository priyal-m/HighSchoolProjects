from cards import Deck
from cards import Card
from cards import Hand



class Game():
    
    def __init__(self, numPlayers):
        self.numPlayers = numPlayers
        
    def playGame(self):
        points = []

        for x in range(self.numPlayers):
            points.append(0)
        numGames = 0
        while self.checkPts(points) and numGames <3:
            points = self.playRound(points)
            numGames = numGames+1
            print("Points " )
            print(points)
        
            
            print("Press any key to continue!")
            xx = input()

        maxPts = 0
        playerVictory = 0
        for x in range(self.numPlayers):
            if(points[x]>maxPts):
                maxPts = points[x]
                playerVictory = x

        playerVic = playerVictory +1
        print("Player " + str(playerVic) + " has Won!")

        
    def playRound(self, points):
        # setting up deck
        deck = Deck()
        deck.populate()
        #deck.shuffle()
        #deck.shuffle()
        #deck.shuffle()

        # dealing cards
        hands = []
        
        if(self.numPlayers == 2):
            hands = [Hand(), Hand()]
            #points = [0, 0]
            tricks = [0, 0]
            honors = [0, 0]
            deck.deal(hands, 6)
        if(self.numPlayers == 4):
            hands = [Hand(), Hand(), Hand(), Hand()]
            #points = [0,0,0,0]
            tricks = [0,0,0,0]
            honors = [0,0,0,0]
            deck.deal(hands, 5)
        if(self.numPlayers == 8):
            hands = [Hand(), Hand(), Hand(), Hand(), Hand(), Hand(), Hand(), Hand()]
            #points = [0,0,0,0,0,0,0,0]
            tricks = [0,0,0,0,0,0,0,0]
            honors = [0,0,0,0,0,0,0,0]
            deck.deal(hands, 3)

        #play
        start = 1
        rounds = 0
        maxRounds = 32/self.numPlayers
        cardsPlayed = Hand()
        
        while rounds<maxRounds :
            cardsPlayed.clear()
            for x in range(start-1,self.numPlayers):
                self.playCards(str(x+1), hands[x], cardsPlayed)
            for x in range(0,start-1):
                self.playCards(str(x+1), hands[x], cardsPlayed)
            rounds = rounds+1

            if(rounds<maxRounds):
                deck.deal(hands,1)
            pos = self.trickWinner(cardsPlayed)
            playerWin = start + pos

            if (playerWin > self.numPlayers) :
                playerWin = playerWin - self.numPlayers
            
            honors[playerWin-1] = honors[playerWin-1] + self.countHonors(cardsPlayed)
            tricks[playerWin-1] = tricks[playerWin-1] +1
            start= playerWin

            
            print("Player " + str(playerWin) + " won!")
            
            print(honors)
            print(tricks)
            
            print("Press any key for next trick!")
            xx = input()
        #honors[0] = 20
        points = self.calculatePoints(points, tricks, honors)
        #print(points)
        return points
        
    def calculatePoints(self, points, tricks, honors):
        for x in range(self.numPlayers):
            if( honors[x] == 20):
                points[x] = 1000
            elif(honors[x]>15):
                points[x] = tricks[x]*2
            elif(honors[x]>10):
                points[x] = tricks[x]*1
        return points
    def countHonors(self, cardsPlayed):
        honors = 0
        for x in cardsPlayed.cards:
            cRank = x.rank
            if(cRank == "10"):
                honors = honors +1
            if(cRank == "J"):
                honors = honors +1
            if(cRank == "Q"):
                honors = honors +1
            if(cRank == "K"):
                honors = honors +1
            if(cRank == "A"):
                honors = honors +1
        return honors
                
    def trickWinner(self, cardsPlayed):
        curSuit = cardsPlayed.cards[0].suit
        maxNum = cardsPlayed.cards[0].rank
        pos =0
        for x in cardsPlayed.cards:
            newSuit = x.suit
            newNum = x.rank
            if(newSuit == curSuit):
                if(self.greater(maxNum,newNum)):
                   maxNum = newNum
        if(maxNum == "A"):
            
            for x in cardsPlayed.cards:
                newSuit = x.suit
                newNum = x.rank
                if(newSuit == curSuit and newNum == "7"):
                    maxNum = "7"
        
        for x in range(0,self.numPlayers):
            newSuit = cardsPlayed.cards[x].suit
            newNum = cardsPlayed.cards[x].rank
            if(newSuit == curSuit and newNum == maxNum):
                pos = x
        return pos
    def greater(self, maxNum, newNum):
        flag = False
        
        if(newNum>maxNum):
            flag = True
        
        if(newNum == "K"):
            if(maxNum == "A"):
                flag = False
            else:
                flag = True
        if(newNum == "Q"):
            if(maxNum == "A"):
                flag = False
            elif(maxNum == "K"):
                flag = False
            else:
                flag = True
        if(newNum == "J"):
            if(maxNum == "A"):
                flag = False
            elif(maxNum == "K"):
                flag = False
            elif(maxNum == "Q"):
                flag = False
            else:
                flag = True
        if(newNum == "10"):
            if(maxNum == "A"):
                flag = False
            elif(maxNum == "K"):
                flag = False
            elif(maxNum == "Q"):
                flag = False
            elif(maxNum == "J"):
                flag = False
            else:
                flag = True
        if(maxNum == "10"):
            if(newNum == "7"):
                flag = False
            elif(newNum == "8"):
                flag = False
            elif(newNum == "9"):
                flag = False
        if(maxNum == "A"):
            flag = False
        if(newNum == "A"):
            flag = True
        
        #print(flag)
        return flag



        
    def playCards(self, player, playerHand,cardsPlayed ):
        for x in range(45):
            print("\n")
        print("Cards Played: ")
        print(cardsPlayed)
        print("Player " + player + " 's Cards")
        print(playerHand)
        print("Which card would you like to play? Enter the card position")
        cardPosition = int(input())

        playerHand.give(playerHand.cards[cardPosition-1],cardsPlayed)
        

    def printHands(self, hands):
        for x in hands:
            print("hand: ")
            print(x)
            print("")

    def checkPts(self, points):
        for x in points:
            if(x>=100):
                return False
        return True
            
    
