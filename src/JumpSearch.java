public class JumpSearch
{
    public static void main(String[] args)
    {
        int[] arr={0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, 233, 377, 610};
        int index=jumpSearch(arr, 55, 4);
        if(index<0)
        {
            System.out.println("Element not found.");
        }
        else
        {
            System.out.println("Element found at :"+index+" index");
        }

    }

    static int jumpSearch(int[] arr, int x, int jump)
    {
        int n=arr.length;
        int index=(int)Math.floor(Math.sqrt(n));
        int prev=index;

        while (arr[Math.min(index,n)-1] < x)
        {
            prev=index;
            index+=(int)Math.floor(Math.sqrt(n));
            if(prev>=n)
                return -1;
        }

        while (arr[prev] < x)
        {
            prev++;
            if(prev==Math.min(index,n))
                return -1;
        }

        if(arr[prev]==x)
            return prev;

        return -1;
    }
}
