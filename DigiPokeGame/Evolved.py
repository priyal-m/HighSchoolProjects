from DigiPoke import DigiPoke
import random
class Evolved(DigiPoke):

    def __init__(self, name, elementType, elementType2):
        super().__init__(name, elementType)
        self.elementType2 = elementType2
        
  
    def retire(self):
        if self.record >= 5:
            print("Your DigiPoke is retiring! Good bye!")
            return True
        else:
            print("You cannot retire")
            return False

    def status(self):
        description = "This DigiPoke is called " + self.name + ". It has the types " + self.elementType + " & "+  self.elementType2 +  ", health:  " + str(self.health)+", and record: "+ str(self.record)+"."
        print(description)
