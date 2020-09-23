import java.util.Scanner;
public class TestMain{
    public static void main(String args[]){
        BusTicket ob=getTicketDetails();
        ob.calculateTotal();
        System.out.println("Ticket no:"+ob.getTicketNo());
        System.out.println("Passenger Name:"+ob.getPerson().getName());
        System.out.println("Price of a ticket : "+ob.getTicketPrice());
        System.out.println("Total Amount : "+ob.getTotalAmount());
    }
    public static BusTicket getTicketDetails(){
        Person p=new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the passenger name:");
        String name = sc.nextLine();
        System.out.println("Enter the gender(M or F / m or f):");
        char ch=sc.next().charAt(0);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println("Enter the ticket no:");
        int ticketNo=sc.nextInt();
        System.out.println("Enter the ticket price:");
        float ticketPrice = sc.nextFloat();
        p.setName(name);
        p.setGender(ch);
        p.setAge(age);
        BusTicket Busticket = new BusTicket();
        Busticket.setTicketNo(ticketNo);
        Busticket.setTicketPrice(ticketPrice);
        Busticket.setTotalAmount(0);
        Busticket.setPerson(p);
        return Busticket;
    }
}