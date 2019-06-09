import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int fact = 1;
      for(int act = 1 ; act <= n ; act++)
        fact = fact*act;
      System.out.println(fact);
	}
}