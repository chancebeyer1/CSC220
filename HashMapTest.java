package csc220;

import java.util.ArrayList;
import java.util.Random;

public class HashMapTest
{
//    public static int min(MyHashMap<Integer, Integer> hash)
//    {
//        ArrayList min = hash.bucket[0];
//        for(int i = 0; i < hash.bucket.length; i++)
//        {
//            if(hash.bucket[i].size() < min.size())
//            {
//                min = hash.bucket[i];
//            }
//        }
//        return min.size();
//    }
//    public static int max(MyHashMap<Integer, Integer> hash)
//    {
//        ArrayList max = hash.bucket[0];
//        for(int i = 0; i < hash.bucket.length; i++)
//        {
//            if(hash.bucket[i].size() > max.size())
//            {
//                max = hash.bucket[i];
//            }
//        }
//        return max.size();
//    }
//    
    

    public static void main(String[] args)
    {
        MyHashMap<Integer, Integer> hash = new MyHashMap();
        Random ran = new Random();
        for (int i = 1; i <= 10_000_000; i++)
        {
            hash.put(ran.nextInt(), 1);
        }
        
        int min = hash.min();
        System.out.println(min);
        int max = hash.max();
        System.out.println(max);
        int avg = hash.avg();
        System.out.println(avg);
  
    }

}
