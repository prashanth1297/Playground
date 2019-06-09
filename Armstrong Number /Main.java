import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
     int num = n;
     int r,t=0;
    for(num = n ; num !=0 ; num=num/10 )
    {
      r = num %10;
      t = t + r*r*r;
    }
       if(t == n)
        System.out.println("Armstrong Number");
    else 
      System.out.println("Not a Armstrong Number");
	}
}