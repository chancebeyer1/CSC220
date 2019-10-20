package csc220;

import java.io.IOException;
import java.util.Arrays;

public class ArrayListTest
{

    public static void main(String[] args) throws IOException
    {
        ExpandableArrayData a = new ExpandableArrayData();
        double[] nums =
        {
            1, 5, 7, 5, 9, 4, 2, 3, 0, 6, 0, 0, 0
        };
        a.numbers = nums;
        a.count = 10;
        System.out.println(Arrays.toString(a.numbers));

        ExpandableArray.addFront(a, 2);
        System.out.println(Arrays.toString(a.numbers));
//        ExpandableArray.delete(a, 4);
//        System.out.println(Arrays.toString(a.numbers));
        System.out.println((a.count));

        ExpandableArray.addMiddle(a, 2, 2);

        String str = ExpandableArray.toString(a);
        System.out.println(str);

        ExpandableArrayData arr = new ExpandableArrayData();
        for (int i = 0; i < 1000; i++)
        {
            ExpandableArray.add(arr, i);
        }
                ExpandableArray.addFront(arr, 3);
            


//        for (int i = 0; i < 1000; i++)
//        {
//            ExpandableArray.addFront(arr, i);
//        }

    }

}
