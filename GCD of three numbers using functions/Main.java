import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.println(gcd_of_tn(n1,n2,n3));
	}
  public static int gcd_of_tn(int n1,int n2, int n3){
    int min = 0;
    if (n1<n2 && n1<n3){
       min = n1;
    }
        else if (n2<n3){
          min = n2;
        }
            else{
              min= n3;
            }
            return min;
          }
}