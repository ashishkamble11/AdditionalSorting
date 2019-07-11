import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearchDemo
{
    static int exponentialSearch(int[] arr, int x)
    {
        if(arr[0]==x)
            return 0;

        int i=1;
        while(i < arr.length && arr[i] <= x)
            i*=2;

        return (Arrays.binarySearch(arr,i/2, Math.min(i, arr.length), x));
    }
    public static void main(String[] args)
    {
        int[] arr={10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to search:");
        int searchElement=sc.nextInt();
        searchElement=exponentialSearch(arr, searchElement);
        System.out.print( (searchElement < 0)  ? "Element not found." : "Element found at index: "+searchElement);
    }
}