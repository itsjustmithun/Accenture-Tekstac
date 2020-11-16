class Book:
    def __init__(self,book_name,book_price,author_name):
        self.__book_name=book_name
        self.__book_price=book_price
        self.__author_name=author_name
    def get_book_name(self):
        return self.__book_name
    def get_book_price(self):
        return self.__book_price
    def get_author_name(self):
        return self.__author_name
    def set_book_name(self,bname):
        self.__book_name=bname
    def set_book_price(self,new_price):
        self.__book_price=new_price
    def set_author_name(self,aname):
        self.__author_name=aname
        
book_name=input("Enter the book name:")
book_price=float(input("Enter the price:"))
author_name=input("Enter the author_name:")
book_obj=Book(book_name,book_price,author_name)
book_obj.set_book_name(book_name)
book_obj.set_book_price(book_price)
book_obj.set_author_name(author_name)

print("Book details before price renewal:")
print("Book Name:"+book_obj.get_book_name())
print("Book Price:%0.1f"%book_obj.get_book_price())
print("Author Name:"+book_obj.get_author_name())
new_price=float(input("Enter the new price:"))
book_obj.set_book_price(new_price)

print("Book details after price renewal:")
print("Book Name:"+book_obj.get_book_name())
print("Book price:%0.1f"%book_obj.get_book_price())
print("Author Name:"+book_obj.get_author_name())