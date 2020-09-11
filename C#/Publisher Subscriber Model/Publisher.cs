using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTemplate //DO NOT change the namespace name
{
    public class Publisher  //DO NOT change the class name
    {
        // declare delegate here
        public delegate void BeforeMessage(string val);
        //declare event of type delegate
        public event BeforeMessage beforeMessageEvent;

        //Implement the method
        public void newMessage(){
            if(beforeMessageEvent!=null){
                beforeMessageEvent.Invoke("Today is a hot day");
            }
        }
      
    }
}
