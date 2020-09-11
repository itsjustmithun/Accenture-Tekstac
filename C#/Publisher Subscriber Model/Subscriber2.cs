using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTemplate     //DO NOT change the namespace name
{
    public class Subscriber2   //DO NOT change the class name
    {
        private Publisher publisher;

        public Subscriber2(Publisher publisher)
        {
            this.publisher = publisher;
            //subscribe to beforeMessageEvent event
            this.publisher.beforeMessageEvent+=beforeMessageEventHandler;
            this.publisher.newMessage();
            
        }

        //Implement Event Handler
        public void beforeMessageEventHandler(string msg){
            Console.WriteLine(msg);
        }
        
    }
}