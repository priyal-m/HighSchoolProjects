from DigiPoke import DigiPoke
from Evolved import Evolved
import random

print("Enter the name of your DigiPoke and the element (Earth, Fire, Air, Ground)")
name = input()
eType = input()

poke1 = DigiPoke(name, eType)

alive = True
flag = False

while alive:
    print('1) Fight\n2) Heal\n3) Evolve\n4) Status')
    choice = input()
    if choice == "1":
        alive = poke1.fight()
    elif choice == "2":
        poke1.heal()
    elif choice == "3":
        flag = poke1.evolve()
    elif choice == "4":
        poke1.status()
    if flag :
        break

if flag :
    LType = ["Earth", "Fire", "Air", "Ground"]
    LType.remove(poke1.elementType)
    elementType2 = LType[random.randint(0,2)]
    poke2 = Evolved(poke1.name, poke1.elementType, elementType2)
    while alive :
        print('1) Fight\n2) Heal\n3) Retire\n4) Status')
        choice = input()
        if choice == "1":
            alive = poke2.fight()
        elif choice == "2":
            poke2.heal()
        elif choice == "3":
            flag2 = poke2.retire()
            if flag2:
                break
        elif choice == "4":
            poke2.status()





