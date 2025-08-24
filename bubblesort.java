import java.util.*;
public class bubblesort
{
    public static void stringPrint(int arr[])
    {
        for(int i=0;i<arr.length ;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={3,29,34,45,24};  
        for(int i=0;i<arr.length -1 ;i++)
        // Runs multiple passes (rounds).
        {
            for(int j=0;j<arr.length-i-1;j++)
            // arr.length - i - 1 means: each time we can stop earlier, since the last part is already sorted.
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        stringPrint(arr);
    }
}
// Best Case: O(n)
// Worst Case: O(n²)
// Average Case: O(n²)