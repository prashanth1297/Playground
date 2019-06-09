import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int n_last = n%10;
      int n_first = n;
      while(n_first >= 10)
      {
        n_first = n_first/10;
      }
      int sum = n_first+n_last;
      System.out.println(sum);
	}
}