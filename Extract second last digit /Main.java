import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n11 = n1%100;
      int n12 = n11/10;
      System.out.println(n12);
	}
}