import random
class DigiPoke():

    def __init__(self, name, elementType):
        
        self.name = name
        self.elementType = elementType
        self.health = 100
        self.record = 0.0
        
    def fight(self):
        victory = random.randint(0,1)
        if victory == 1:
            print("victory!")
            self.record += 1
            self.health -= 10
        else:
            print("lost!")
            self.health -= 25

        if self.health<= 0:
            print("Your DigiPoke died")
            return False
        else:
            return True
    
    def heal(self):
        self.record -= 0.5
        self.health += 10
                
    def evolve(self):
        if self.record >= 5:
            print("You can evolve!")
            return True
        else:
            print("You cannot evolve")
            return False
        
        
    def status(self):
        description = "This DigiPoke is called " + self.name + ". It has the type " + self.elementType + ", health:  " + str(self.health)+", and record: "+ str(self.record)+"."
        print(description)
