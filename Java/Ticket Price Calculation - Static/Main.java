import java.util.*;
public class Main{
    static int avail;
    static int total;
    public static void main(String args[]){
        int id,price,bnum,num,amt,i;
        Ticket t = new Ticket();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        bnum = sc.nextInt();
        System.out.println("Enter the available tickets:");
        avail = sc.nextInt();
        t.setAvailableTickets(avail);
        for(i=0;i<bnum;i++){
            System.out.println("Enter the ticketid:");
            id = sc.nextInt();
            System.out.println("Enter the price:");
            price = sc.nextInt();
            t.setPrice(price);
            System.out.println("Enter the no of tickets:");
            num= sc.nextInt();
            if(avail<num){
                System.out.println("Tickets not sufficient / available");
                break;
            }
            avail = t.getAvailableTickets();
            System.out.println("Available tickets:"+avail);
            amt = t.calculateTicketCost(num);
            System.out.println("Total amount:"+amt);
            total=t.getAvailableTickets();
            System.out.println("Available ticket after booking"+total);
        }
    }
}