import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements");

        int sum = 0;

        for( int i = 0; i< arr.length;i++)
        {
            arr[i] = sc.nextInt();

            sum += arr[i];
        }

        System.out.println(" sum = "  + sum );
        sc.close();
    }
}