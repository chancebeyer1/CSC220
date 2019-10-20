package csc220;

public class ExpandableArray
{
    //	expand an array of numbers by 1 

    public static void expandArrayIfNeeded(ExpandableArrayData a)
    {
        //	is the array full, so we need to expand
        if (a.count == a.numbers.length)
        {
            //	double the size of the array of numbers
            double[] new_a = new double[a.numbers.length * 2];
            for (int i = 0; i < a.numbers.length; i++)
            {
                new_a[i] = a.numbers[i];
            }

            a.numbers = new_a;
        }
    }

    //	add d to an expandable array
    public static void add(ExpandableArrayData a, double d)
    {
        expandArrayIfNeeded(a);
        a.numbers[a.count] = d;
        a.count++;
    }

    public static void delete(ExpandableArrayData L, int i)
    {
        for (int x = i; x < L.count - 1; x++)
        {
            L.numbers[x] = L.numbers[x + 1];
        }
        //  this.nums[i] = 0;
        L.count--;
    }

    public static void addFront(ExpandableArrayData L, double d)
    {
        addMiddle(L, d, 0);
    }

    public static void addMiddle(ExpandableArrayData L, double d, int i)
    {
        expandArrayIfNeeded(L);
            for (int j = L.count; j >= i; j--)
            {
                L.numbers[j + 1] = L.numbers[j];
            }
        
        L.numbers[i] = d;
        L.count++;
    }

    public static String toString(ExpandableArrayData L)
    {
        StringBuilder result = new StringBuilder(L.count);
        result.append("[");
        for (int i = 0; i < L.count; i++)
        {
            if (i != L.count - 1)
            {
                result.append(L.numbers[i]);
                result.append(", ");
            }
            else
            {
                result.append(L.numbers[i]);
            }
        }
        result.append("]");

        return result.toString();
    }
}
