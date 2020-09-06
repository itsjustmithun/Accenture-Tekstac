using System;
public class Program{
    public static void Main(string[] args){
        Console.WriteLine("Enter product id");
        int id=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter product name");
        string name=Console.ReadLine();
        Console.WriteLine("Enter product price");
        double price=Convert.ToDouble(Console.ReadLine());
        Product p1=new Product();
        p1.ProductId=id;
        p1.ProductName=name;
        p1.Price=price;
        p1.Display();
    }
}
public class Product{
    private int productId;
    private string productName;
    private double price;
    public int ProductId{
        set{
            productId=value;
        }
        get{
            return productId;
        }
    }
    public string ProductName{
        set{
            productName=value;
        }
        get{
            return productName;
        }
    }
    public double Price{
        set{
            if(value<0){
                price=0;
            }
            else{
                price=value;
            }
        }
        get{
            return price;
        }
    }
    public void Display(){
        Console.WriteLine("Product ID: {0}",productId);
        Console.WriteLine("Product Name: {0}",productName);
        Console.WriteLine("Product Price: {0}",price);
    }
}