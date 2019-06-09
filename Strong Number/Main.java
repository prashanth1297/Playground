import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int p,r,a;
      int sum=0;
      int s =n;
      while(n != 0)
      {
        p = 1;
      r =1;
      a = n %10;
      while(p <= a)
      {
        r = r*p;
      p++;
      }
      sum = sum + r;
      n = n/10;
      }
      if(sum == s)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}