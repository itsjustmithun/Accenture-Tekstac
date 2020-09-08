using System;
using System.Collections;
using System.Collections.Generic;

public class Program      //DO NOT change the class name
{
    //Declare ArrayList as 'static'
    static ArrayList fruitList=new ArrayList();
    public static void Main(string[] args)    //DO NOT change the 'Main' method signature
    {
        string flag="no";
        string fruit;
        do
        {
            //Implement code here
            Console.WriteLine("Enter Fruit Name");
            fruit=Console.ReadLine();
            Console.WriteLine("Add another fruit(yes/no)");
            flag=Console.ReadLine();
            Program.fruitList.Add(fruit);
        }while(flag=="yes");
       // Console.WriteLine(fruitList.Count);
    }
}