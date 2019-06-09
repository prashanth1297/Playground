import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count = 0;
    int n_second = n;
    while(n_second >=10)
    {
      if(n_second < 100 )
      {
        n_second = n_second%10;
      }
      else
        n_second = n_second/10;
    }
    System.out.println(n_second);
  }
  
}
        
        
        
        
        
        