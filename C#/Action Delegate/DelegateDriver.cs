using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTemplate      //DO NOT change the namespace name
{
    public class GenericDelegates   //DO NOT change the class name
    {
        Action<String> search;

        String[] lastName = { "Thomas", "Moody", "Joe", "Kapoor", "Shirley" };
        String[] mailId = { "tmail@hotmail.com","moody1209@yahoo.com","sam12@hotmail.com","priv54@gmail.com","Tracy123@live.com"};

        String result;
        public static void Main(string[] args)    //DO NOT change the 'Main' method signature
        {
            //Implement your code here 
            Console.WriteLine("1.Search By Name\n2.Search By Mail\nEnter Option : ");
            string k=Console.ReadLine();
            Console.WriteLine("Enter Name or Mail Id\nEnter Input :");
            string str=Console.ReadLine();
            GenericDelegates ob = new GenericDelegates();
            ob.searchPerson(str,k);
        }

        //Implement Handler method
        public void findByLastName(string name){
            for(int i=0;i<lastName.Length;i++){
                if(lastName[i].Equals(name)){
                    Console.WriteLine(name+" found");
                    break;
                }
            }
        }
        public void findByEmail(string mail){
            foreach(string b in mailId){
                if(b.Equals(mail))
                    Console.WriteLine(mail+" found");
            }
        }

        //Implement searchPerson method
        public void searchPerson(string input, string response){
            switch(response){
                case "1":search=findByLastName;
                        search(input);
                        break;
                case "2":search=findByEmail;
                        search(input);
                        break;
            }
        }


    }
}
