using System;
public class Game{
    public string Name{
        set;
        get;
    }
    public int MaxNumPlayers{
        set;
        get;
    }
    public override string ToString(){
        string str=string.Format("Maximum number of players for {0} is {1}", Name,MaxNumPlayers);
        return str;
    }
}
public class GameWithTimeLimit : Game{
    public int Minutes{
        set;
        get;
    }
    public override string ToString(){
        //string s=base.ToString();
        Console.WriteLine(base.ToString());
        string str=string.Format("Time Limit for {0} is {1} minutes",Name,Minutes);
        return str;
    }
}
public class Program{
    public static void Main(String[] args){
        Console.WriteLine("Enter a game");
        string game_name=Console.ReadLine();
        Console.WriteLine("Enter the maximum number of players");
        int max1=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter a game that has time limit");
        string game1=Console.ReadLine();
        Console.WriteLine("Enter the maximum number of players");
        int max_player=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter the time limit in minutes");
        int time_limit=Convert.ToInt32(Console.ReadLine());
        Game obj;
        obj=new Game();
        obj.Name=game_name;
        obj.MaxNumPlayers=max1;
        string first=obj.ToString();
        Console.WriteLine(first);
        
        GameWithTimeLimit obj1=new GameWithTimeLimit();
        obj1.Name=game1;
        obj1.MaxNumPlayers=max_player;
        obj1.Minutes=time_limit;
        string lst=obj1.ToString();
        Console.WriteLine(lst);
    }
}