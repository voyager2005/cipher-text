# initialization
flag = False

# accepting the number from the user
number = input("Enter a number: ")

# loop to find factors
for i in range(2, (int(number)-1)):
    if int(number) % i == 0:
        flag = True
        break

# checking if there are any factors
if flag:
    print(number + " is not a prime number")
else:
    print(number + " is a prime number")
