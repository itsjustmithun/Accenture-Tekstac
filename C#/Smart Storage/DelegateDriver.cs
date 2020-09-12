using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTemplate                 //DO NOT CHANGE THE NAMESPACE NAME
{
    //declare the Delegate here
    public delegate String Storage();
    public class SmartStorage              //DO NOT CHANGE THE CLASS NAME AND ACCESS SPECIFIER    
    {
         public SmartStorage()
        {
            // Register the event handler
            CapacityEvent = new Storage(CapacityEventHandler);
        }
        //declare the Event here
        public event Storage CapacityEvent;
        static void Main(string[] args)
        {
           int i;
           SmartStorage obj = new SmartStorage();
           for(i=0;i<10;i++){
               int num = Convert.ToInt32(Console.ReadLine());
               if(i==8){
                   Console.WriteLine(obj.CapacityEvent.Invoke());
               }
               obj.put(num);
           }
        }
        
        //Implement Event Handler
        public String CapacityEventHandler(){
            return "Reaching Capacity";
        }
        
        //Implement put method
        public void put(int num){
            int[] array=new int[10];
            for(int i=0;i<10;i++)
                array[i]=num;
        }
    }
}
