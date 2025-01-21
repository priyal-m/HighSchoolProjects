from Game import Game

print("Hi! Do you want to play a 2, 4, or 8 player game?")
players = input()

game1 = Game(int(players))
game1.playGame()
