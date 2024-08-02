public static void Main(string[] args)
{
    Console.BackgroundColor = ConsoleColor.DarkBlue;
        
    Console.ForegroundColor = ConsoleColor.Magenta;
    
    Console.WriteLine("First steps to C#");
    
    string sentence = Console.ReadLine();
    Console.Clear();
    
    System.Threading.Thread.Sleep(5000);
    
    Console.WriteLine($"Choose four different numbers between 1 and {sentence.Length}");
    
    int [] locs = {0,0,0,0};
    for(int i = 0; i < 4; i++){
        Console.WriteLine($"Enter {i+1}. number: ");
        var val = Console.ReadLine();
        var res = Convert.ToInt32(val);
        while(res > sentence.Length || res < 0){
            Console.WriteLine($"Your sentence based on only {sentence.Length} lenght so enter number below that number. Or you cannot input under 0. ");
            
            val = Console.ReadLine();
            res = Convert.ToInt32(val);
        }
        
        locs[i] = res-1;
    }
    Console.WriteLine($"Enter your selected character: ");
    string chr = Console.ReadLine();

    for(int i = 0; i < 4; i++)
        Console.WriteLine($"{locs[i]+1}. number is according to {sentence[locs[i]]} char in your input.");
    
    Console.WriteLine($"Your input is {chr}");

}