public class Passenger{
    private int ticketid;
    private String name;
    private String gender;
    private String address;
    public Passenger(int ticketid,String name,String gender,String address){
        this.ticketid=ticketid;
        this.name=name;
        this.gender=gender;
        this.address=address;
    }
    public int getTicketid(){
        return ticketid;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
    @Override
    public String toString(){
        return "ticketid:"+getTicketid()+",name:"+getName()+",gender:"+getGender()+",address:"+getAddress();
    }
    public void setTicketid(int ticketid){
        this.ticketid=ticketid;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setAddress(String address){
        this.address=address;
    }
}