public class BusTicket{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;
    public void setTicketNo(int ticketNo){
        this.ticketNo=ticketNo;
    }
    public void setTicketPrice(float ticketPrice){
        this.ticketPrice=ticketPrice;
    }
    public void setTotalAmount(float totalAmount){
        this.totalAmount=totalAmount;
    }
    public void setPerson(Person person){
        this.person=person;
    }
    public Person getPerson(){
        return person;
    }
    public int getTicketNo(){
        return ticketNo;
    }
    public float getTicketPrice(){
        return ticketPrice;
    }
    public float getTotalAmount(){
        return totalAmount;
    }
    public void calculateTotal(){
        int age=person.getAge();
        char gender=person.getGender();
        if(age<16)
            totalAmount=ticketPrice-((ticketPrice*50)/100);
        else if(age>=60)
            totalAmount=ticketPrice-((ticketPrice*25)/100);
        else if(gender=='F' || gender=='f')
            totalAmount=ticketPrice-((ticketPrice*10)/100);
        else
            totalAmount=ticketPrice;
    }
}