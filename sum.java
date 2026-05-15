import java.util.Scanner;
public class sum
{
    public static void main(String[] args)
    {
        System.out.println("eneter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements");

        int sum = 0;

        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
            sum += arr[i];
        }

        System.out.println("sum " + sum);
        sc.close();

    }
}