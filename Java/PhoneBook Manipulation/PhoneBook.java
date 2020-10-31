import java.util.*;
public class PhoneBook{
    private List<Contact> phoneBook=new ArrayList<Contact>();
    public void setPhoneBook(List<Contact> phoneBook){
        this.phoneBook=phoneBook;
    }
    public List<Contact> getPhoneBook(){
        return phoneBook;
    }
    public void addContact(Contact contactObj){
        phoneBook.add(contactObj);
    }
    public List<Contact> viewAllContacts(){
        return phoneBook;
    }
    public Contact viewContactGivenPhone(long phoneNumber){
        for(Contact c:phoneBook){
            if(c.getPhoneNumber()==phoneNumber){
                return c;
            }
        }
        return null;
    }
    public boolean removeContact(long phoneNumber){
        Iterator<Contact> itr=phoneBook.iterator();
        while(itr.hasNext()){
            if((itr.next()).getPhoneNumber()==phoneNumber){
                itr.remove();
                return true;
            }
        }
        return false;
    }
}