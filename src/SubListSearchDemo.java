import java.util.ArrayList;
import java.util.List;

public class SubListSearchDemo
{
    public static void main(String[] args)
    {
        int i=0,j=0,k=0;
        int counter;
        boolean flag=false;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        //adding to the list 1
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        //adding to the list 2
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.add(1);
        list2.add(2);
        list2.add(3);

        Integer[] arr1=  list1.toArray(new Integer[list1.size()]);
        Integer[] arr2=  list2.toArray(new Integer[list2.size()]);
        counter=arr1.length;

        while (j < arr2.length)
        {
            //check for second array finished or not
            if(j == arr2.length-1 && i < arr1.length-1)
            {
                System.out.println("List 2 is finished and List not found.");
                return;
            }

            if(arr2[j] == arr1[i])
            {
                counter--;
                flag = true;
            }
            else
            {
                flag = false;
                i=0;
                k++;
                j=k;
                continue;
            }

            i++;
            j++;
        }

        if(flag)
        {
            System.out.println("List 1 present in List 2");
        }
    }
}
