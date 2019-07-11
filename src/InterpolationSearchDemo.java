import java.util.Scanner;

public class InterpolationSearchDemo
{

    public static void main(String[] args)
    {
        int index=0;
        int[] arr={10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to search:");
        int searchElement=sc.nextInt();

        index=interpolationSearch(arr, searchElement);

        if(index != -1)
            System.out.println("Element found at :"+index);
        else
            System.out.println("Element not found.");
    }

    static int interpolationSearch(int[] arr, int x)
    {
        int low=0, high=arr.length-1;

        while (low <= high && x >= arr[low] && x <= arr[high])
        {
            if(low == high)
            {
                if(arr[low]==x)
                    return low;
                return -1;
            }
            int pos=low + (( x - arr[low]) * (high - low) / (arr[high] - arr[low] ));

            if(arr[low]==x)
                return low;

            if(arr[pos] < x)
            {
                low=pos+1;
            }
            else
            {
                high=pos-1;
            }
        }
        return -1;
    }
}