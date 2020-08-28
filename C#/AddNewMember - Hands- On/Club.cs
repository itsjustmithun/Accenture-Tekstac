using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AddNewMember        //Do not change the namespace name
{
    public class Club        //Do not change the class name
    {
        static Dictionary<int, string> groupInfo = new Dictionary<int, string>() { { 1, "Gold" }, { 2, "Silver" }, { 3, "Platinum" } };
        static Dictionary<int, List<String>> memberInfo = new Dictionary<int, List<String>>() {
                                    { 1, new List<string>(){ "Tom","Harry"} },
                                    { 2,new List<string>(){ "Sam","Peter"} },
                                    { 3,new List<string>(){ "Kim","Robert"} } };
        
       
        public static void Main(string[] args)
        {
            
            //Implement your code here
            Console.WriteLine("Group Name:");
            string name=Console.ReadLine();
            int key=0;
            foreach(KeyValuePair<int,string> s in groupInfo){
                if(s.Value==name){
                    Console.WriteLine("Member Name:");
                    string mname = Console.ReadLine();
                    key=s.Key;
                    foreach(KeyValuePair<int,List<string>> i in memberInfo){
                        if(i.Key==key){
                            memberInfo[key].Add(mname);
                            break;
                        }
                    }
                    break;
                }
            }
            foreach(KeyValuePair<int, List<string>> i in memberInfo){
                if(i.Key==key){
                    foreach(string s in memberInfo[key]){
                        Console.WriteLine(s);
                    }
                }
            }
            
        }
    }
}