public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    public int getTicketid(){
        return ticketid;
    }
    public int getPrice(){
        return price;
    }
    public static int getAvailableTickets(){
        return availableTickets;
    }
    public void setTicketid(int id){
        this.ticketid = id;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public static void setAvailableTickets(int t){
        if(t>0)
            availableTickets=t;
        else
            System.out.println("Zero and negative values are not allowed.");
    }
    public int calculateTicketCost(int nooftickets){
        int a,b,amt;
        a=getAvailableTickets();
        b=getPrice();
        if(a>nooftickets){
            availableTickets = a-nooftickets;
            amt=nooftickets*b;
            setAvailableTickets(availableTickets);
            return amt;
        }
        else{
            System.out.println("Tickets not sufficient / available");
            return -1;
        }
    }
}