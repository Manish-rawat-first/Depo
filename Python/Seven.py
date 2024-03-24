age =  (int)(input("Enter Age:"))

if(age<18):
    print("You are not eligible for vote")
elif(age>=18 and age<65):
    print("You are eligible for vote")
else:
    print("You are not eligible for vote because you are 65 age over")