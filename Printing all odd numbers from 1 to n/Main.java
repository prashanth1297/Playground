import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      for( int num = n%2; num<=n; num++)
        if (num%2 != 0)
        System.out.println(num);
	}
}