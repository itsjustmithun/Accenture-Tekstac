import java.util.*;
import java.io.*;
import java.lang.*;
public class Shop{
    private String shopName;
    private String shopAddress;
    private String[] products;
    public void setShopName(String name){
        this.shopName=name;
    }
    public void setShopAddress(String add){
        this.shopAddress=add;
    }
    public void setProducts(String[] pro){
        this.products=pro;
    }
    public String getShopName(){
        return shopName;
    }
    public String getShopAddress(){
        return shopAddress;
    }
    public String[] getProducts(){
        return products;
    }
    public Shop(String sName, String sAddress, String[] prod){
        setShopName(sName);
        setShopAddress(sAddress);
        setProducts(prod);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shopname:");
        String s=sc.nextLine();
        System.out.println("Enter the address:");
        String u=sc.nextLine();
        System.out.println("Enter number of products:");
        int n=Integer.parseInt(sc.nextLine());
        if(n<=0){
            System.exit(0);
        }
        else if(n>0){
            String[] t =new String[n];
            for(int i=0;i<n;i++){
                t[i]=sc.nextLine();
            }
            Shop a=new Shop(s,u,t);
            System.out.println("Enter the product to be searched:");
            String p=sc.nextLine();
            boolean b=a.checkProductAvailability(p);
            if(b==true){
                System.out.println("Product is available at "+a.getShopName()+", "+a.getShopAddress()+".");
            }
            else{
                System.out.println("Product is not available at "+a.getShopName()+", "+a.getShopAddress()+".");
            }
        }
    }
    public boolean checkProductAvailability(String productname){
        for(int i=0;i<getProducts().length;i++){
            if(getProducts()[i].equalsIgnoreCase(productname)){
                return true;
            }
        }
        return false;
    }
}