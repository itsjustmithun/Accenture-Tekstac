import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PhoneBook p=new PhoneBook();
        int ch=0;
        while(true){
            System.out.println("Menu \n1.Add Contact \n2.Display all contacts \n3.Search contact by phone \n4.Remove contact \n5.Exit \n.Enter your choice: ");
            ch=sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1: System.out.println("Add a Contact: \nEnter the First Name: ");
                        //sc.nextLine();
                        String fname=sc.nextLine();
                        System.out.println("Enter the Last Name: ");
                        String lname=sc.nextLine();
                        System.out.println("Enter the Phone No.: ");
                        long phoneno=sc.nextLong();
                        sc.nextLine();
                        System.out.println("Enter the Email: ");
                        //sc.nextLine();
                        String email=sc.nextLine();
                        Contact c=new Contact(fname,lname,phoneno,email);
                        p.addContact(c);
                        break;
                        
                case 2: System.out.println("The Contacts in the List are:");
                        List<Contact> l=p.viewAllContacts();
                        for(Contact c1: l){
                            System.out.println("First Name: "+c1.getFirstName());
                            System.out.println("Last Name: "+c1.getLastName());
                            System.out.println("Phone No.: "+c1.getPhoneNumber());
                            System.out.println("Email: "+c1.getEmailId());
                        }
                        break;
                        
                case 3: System.out.println("Enter the Phone number to search contact:");
                        long phno=sc.nextLong();
                        Contact obj=p.viewContactGivenPhone(phno);
                        System.out.println("The contact is: ");
                        System.out.println("First Name: "+obj.getFirstName());
                        System.out.println("Last Name: "+obj.getLastName());
                        System.out.println("Phone No.: "+obj.getPhoneNumber());
                        System.out.println("Emmail: "+obj.getEmailId());
                        break;
                        
                case 4: System.out.println("Enter the Phone number to remove :");
                        //sc.nextLine();
                        long pno=sc.nextLong();
                        sc.nextLine();
                        System.out.println("Do you want to remove the contact(Y/N):");
                        String cc=sc.nextLine();
                        if(cc.equals("Y")){
                            boolean ret=p.removeContact(pno);
                            System.out.println("The contact is successfully deleted.");
                        }
                        break;
                        
                case 5: System.exit(0);
                default: System.exit(0);
            }
        }
    }
}