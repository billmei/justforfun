import random
import time


def main():
    timesFlipped = int(raw_input("Enter number of flips: "))
    numberOfCoins = 0
    while numberOfCoins < timesFlipped:
        coin = random.randint(0, 1)
        numberOfCoins += 1
        if coin == 1:
            print "Heads"
        else:
            print "Tails"

if __name__ == '__main__':
    main()

time.sleep(1000)
