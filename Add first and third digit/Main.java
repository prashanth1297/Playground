import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n1_first = n1/100;
      int n1_last = n1%10;
      int sum = n1_first + n1_last;
      System.out.println(sum);
	}
}