import java.util.*;
public class TestBook{
    public static void main(String args[]){
        int p;
        String an, n;
        Book b = new Book();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Book name:");
        n = s.next();
        b.setBookName(n);
        System.out.println("Enter the price");
        p=s.nextInt();
        b.setBookPrice(p);
        System.out.println("Enter the Author name");
        an=s.next();
        b.setAuthorName(an);
        System.out.println("Book Details");
        System.out.println("Book Name:"+b.getBookName());
        System.out.println("Book Price:"+b.getBookPrice());
        System.out.println("Author Name:"+b.getAuthorName());
    }
}