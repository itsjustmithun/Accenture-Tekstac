word=input("Enter the word : ")
new=word[::-1]
newcheck=new.lower().replace(" ","")
check=word.lower().replace(" ","")
if(newcheck==check):
    print("Yes, the string is a palindrome !")
else:
    print("No, the string is not a palindrome !")