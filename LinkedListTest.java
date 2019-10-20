package csc220;

import java.util.Iterator;

public class LinkedListTest
{

    public static void main(String[] args)
    {
        MyLinkedList<Integer> L = new MyLinkedList<>();
        for (int i = 1; i <= 1_000_000; i++)
        {
            L.add(i);
        }
        int sum = 0;
        for (int e : L)
        {
            sum += e;
        }
        System.out.println(sum);

        Iterator<Integer> it = L.iterator();
        sum = 0;
        while (it.hasNext())
        {
            int d = it.next();
            sum += d;
        }
        System.out.println(sum);

//        String b = L.toString();
//        System.out.println(b);
//        L.delete(2);
//        String c = L.toString();
//        System.out.println(c);
//        L.addMiddle(2, 0);
//        L.addMiddle(2, 7);
//        L.addMiddle(2, 19);
//        String d = L.toString();
//        System.out.println(d);
//        L.set(8, 2);
//        String e = L.toString();
//        System.out.println(e);
    }

}
