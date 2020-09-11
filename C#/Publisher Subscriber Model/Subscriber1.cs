using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTemplate   //DO NOT change the namespace name
{
    public class Subscriber1   //DO NOT change the class name
    {
        private Publisher publisher;

        public Subscriber1(Publisher publisher)
        {
            this.publisher = publisher;
            //subscribe to beforeMessageEvent event here
            this.publisher.beforeMessageEvent +=beforeMessageEventHandler;
            
        }
        //Implement Event Handler
        public void beforeMessageEventHandler(string msg){
            Console.WriteLine(msg);
        }

        
    }
}