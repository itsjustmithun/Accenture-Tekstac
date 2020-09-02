public class Book{
    private String bookName;
    private int bookPrice;
    private String authorName;
    public String getBookName(){
        return bookName;
    }
    public int getBookPrice(){
        return bookPrice;
    }
    public String getAuthorName(){
        return authorName;
    }
    public void setBookName(String name){
        this.bookName=name;
    }
    public void setBookPrice(int price){
        this.bookPrice=price;
    }
    public void setAuthorName(String aname){
        this.authorName=aname;
    }
}