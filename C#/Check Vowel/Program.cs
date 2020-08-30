using System;
namespace Methods1{
    public class Program{
        public static void Main(string[] args){
            char c = Convert.ToChar(Console.ReadLine());
            bool b =  CheckIsVowel(c);
            if(b)
                Console.Write("The given input is a vowel : true");
            else
                Console.Write("The given input is a vowel : false");
        }
        public static bool CheckIsVowel(char ch){
            char t=char.ToLower(ch);
            if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u')
                return true;
            else
                return false;
        }
    }
}