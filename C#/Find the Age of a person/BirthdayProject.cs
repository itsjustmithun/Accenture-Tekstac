using System;
public class Person{
    private string firstName;
    private string lastName;
    private DateTime dob;
    public string FirstName{
        set{
            firstName=value;
        }
        get{
            return firstName;
        }
    }
        public string LastName{
            set{
                lastName=value;
            }
            get{
                return lastName;
            }
        }
        public DateTime Dob{
            set{
                dob=value;
            }
            get{
                return dob;
            }
        }
        public string Adult{
            set{}
            get{
                if(this.GetAge(this.dob)>=18){
                    return "Adult";
                }
                else{
                    return "Child";
                }
            }
        }
        public void DisplayDetails(){
            Console.WriteLine("First Name: {0}",firstName);
            Console.WriteLine("Last Name: {0}",lastName);
            Console.WriteLine("Age: {0}",this.GetAge(this.dob));
            Console.WriteLine(this.Adult);
        }
        public int GetAge(DateTime dbo){
            int age=0;
            age=DateTime.Now.Year-dob.Year;
            if(DateTime.Now.DayOfYear<dob.DayOfYear){
                age=age-1;
            }
            return age;
        }
    }
    public class Program{
        public static void Main(string[] args){
            Person p = new Person();
            Console.WriteLine("Enter first name");
            string name=Console.ReadLine();
            Console.WriteLine("Enter last name");
            string lname=Console.ReadLine();
            Console.WriteLine("Enter date of birth in yyyy/mm/dd/ format");
            DateTime bday=DateTime.Parse(Console.ReadLine());
            p.FirstName=name;
            p.LastName=lname;
            p.Dob=bday;
            p.DisplayDetails();
        }
    }
