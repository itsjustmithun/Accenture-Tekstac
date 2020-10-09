import java.util.*;
public class Main{
    public static void main(String args[]){
        int c;
        Movie m = getMovieDetails();
        String mov = getCircle();
        c=m.calculateTicketCost(mov);
        if(c==0){
            System.out.println("Movie name = "+m.getMovieName());
            System.out.println("Movie category = "+m.getMovieCategory());
            System.out.println("The ticket cost is = "+m.getTicketCost());
        }
        else if(c== -1){
            System.out.println("Movie name = "+m.getMovieName());
            System.out.println("Movie category = "+m.getMovieCategory());
            System.out.println("Sorry there is no "+m.getMovieCategory()+" type of category in theater.");
        }
        else if(c== -2){
            System.out.println("Movie name = "+m.getMovieName());
            System.out.println("Movie category = "+m.getMovieCategory());
            System.out.println("Sorry!!! Circle is Invalid.");
        }
        else if(c== -3){
            System.out.println("Movie name = "+m.getMovieName());
            System.out.println("Movie category = "+m.getMovieCategory());
            System.out.println("Sorry!!! Both circle and category are Invalid.");
        }
    }
    public static Movie getMovieDetails(){
        Scanner sc = new Scanner(System.in);
        Movie m = new Movie();
        System.out.println("Enter the movie name:");
        m.setMovieName(sc.nextLine());
        System.out.println("Enter the movie category:");
        m.setMovieCategory(sc.nextLine());
        return m;
    }
    public static String getCircle(){
        Scanner sc = new Scanner(System.in);
        String mn;
        System.out.println("Enter the circle:");
        mn=sc.nextLine();
        return mn;
    }
}