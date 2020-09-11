using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTemplate //DO NOT change the namespace name
{
    public class DelegateDriver  //DO NOT change the class name
    {
        static void Main(string[] args) //DO NOT change the 'Main' method signature
        {
           //implement code here
           Publisher p=new Publisher();
           Subscriber1 s1=new Subscriber1(p);
           Subscriber2 s2=new Subscriber2(p);
           
        }
    }
}
