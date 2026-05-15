public class insertion 
{
public static void main(String[] args)
    {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5;
        int index = 3;
        int value = 15;


        for(int i = n; i > index; i--)
        {
            arr[i] = arr[i - 1];

        }

        arr[index] = value;
        n++;


    for(int i = 0; i < n;i++)
    {
        System.out.print(arr[i] + " ");
    }
    }

    
}
