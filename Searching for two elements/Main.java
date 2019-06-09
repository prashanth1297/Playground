import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the array size
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int i = 0; i<= arr_size - 1; i++)
        {
            arr[i] = in.nextInt();
        }
         int search1 = in.nextInt();
         int search2 = in.nextInt();
        int elem1 = -1;
        int elem2 = -1;
       
        for(int i = 0; i <= arr_size - 1; i++)
        {
            if(search1 == arr[i])
            {
                elem1 = i;
            }
            if(search2 == arr[i]){
                elem2 = i;
            }
        }
        System.out.println(elem1);
        System.out.println(elem2);
    }
}