public class Movie{
    private String movieName;
    private String movieCategory;
    private int ticketCost;
    
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    public String getMovieName(){
        return movieName;
    }
    public void setMovieCategory(String movieCategory){
        this.movieCategory=movieCategory;
    }
    public String getMovieCategory(){
        return movieCategory;
    }
    public void setTicketCost(int ticketCost){
        this.ticketCost=ticketCost;
    }
    public int getTicketCost(){
        return ticketCost;
    }
    public int calculateTicketCost(String circle){
        if((circle.equalsIgnoreCase("gold"))){
            if((getMovieCategory().equalsIgnoreCase("2d"))){
                setTicketCost(300);
                return 0;
            }
            else if((getMovieCategory().equalsIgnoreCase("3d"))){
                setTicketCost(500);
                return 0;
            }
            else{
                return -1;
            }
        }
        else if((circle.equalsIgnoreCase("silver"))){
            if((getMovieCategory().equalsIgnoreCase("2d"))){
                setTicketCost(250);
                return 0;
            }
            else if((getMovieCategory().equalsIgnoreCase("3d"))){
                setTicketCost(450);
                return 0;
            }
            else{
                return -1;
            }
        }
        else if((getMovieCategory().equalsIgnoreCase("2d")) || (getMovieCategory().equalsIgnoreCase("3d"))){
            return -2;
        }
        else{
            return -3;
        }
    }
}