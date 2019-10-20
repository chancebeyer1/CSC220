package csc220;

import java.util.ArrayList;

//	a (separate chaining) hash map storing keys of type K, and values of type V
public class MyHashMap<K, V>
{

    //	an array whose elements are arraylist of kvps with keys of type K and values of type V
    private ArrayList<KVP<K, V>>[] bucket;
    private int size;

    //	M is the number of buckets
    public MyHashMap(int M)
    {
        this.bucket = new ArrayList[M];
        for (int i = 0; i < this.bucket.length; i++)
        {
            bucket[i] = new ArrayList<>();
        }
        this.size = 0;
    }

    public MyHashMap()
    {
        this(37);
    }

    //	given a key, choose which bucket it is in
    private int chooseBucket(K key, int M)
    {
        int h = key.hashCode();
        return Math.abs(h) % M;
    }

    //	find the pair in a given bucket, with the given key, or null
    private KVP<K, V> findPair(int b, K key)
    {
        //	search bucket b for the key
        for (KVP<K, V> pair : bucket[b])
        {
            //	key already in the map, so return the KVP and finish
            if (pair.key.equals(key))
            {
                return pair;
            }
        }

        return null;
    }

    private boolean containsKey(K key)
    {
        return get(key) != null;
    }

    private void delete(K key)
    {
        int b = chooseBucket(key, this.bucket.length);
        for (KVP<K, V> pair : bucket[b])
        {
            //	key already in the map, so return the KVP and finish
            if (pair.key.equals(key))
            {
                bucket[b].remove(pair);
            }
        }
    }

    private void resizeTheMap()
    {
        ArrayList[] newArray = new ArrayList[this.bucket.length * 2];
        for (int i = 0; i < this.bucket.length * 2; i++)
        {
            newArray[i] = new ArrayList<>();
        }
        for (int i = 0; i < this.bucket.length; i++)
        {
            for (int j = 0; j < bucket[i].size(); j++)
            {
                KVP<K, V> pair = bucket[i].get(j);
                //      Ask Graham about chooseBucket method
                int b = chooseBucket(pair.key, newArray.length);
                newArray[b].add(pair);
            }
        }
        this.bucket = newArray;
    }

    public void put(K key, V value)
    {
        //if (this.size() / this.bucket.length > 2)
        if (this.size() > this.bucket.length * 2)
        {
            resizeTheMap();
        }

        //	figure out which bucket the key is in
        int b = chooseBucket(key, this.bucket.length);
        KVP<K, V> pair = findPair(b, key);
        if (pair != null)
        {
            //	already had this pair so change it
            pair.value = value;
        }
        else
        {
            //	key is not in the map, so add to the map
            KVP<K, V> newPair = new KVP<>(key, value);
            bucket[b].add(newPair);
            this.size++;
        }
    }

    public V get(K key)
    {
        //	figure out which bucket the key is in
        int b = chooseBucket(key, this.bucket.length);
        KVP<K, V> pair = findPair(b, key);
        if (pair != null)
        {
            return pair.value;
        }
        else
        {
            //	key is not in the map, so return null
            return null;
        }
    }

    public int size()
    {
        return this.size;
    }

    public int min()
    {
        ArrayList min = this.bucket[0];
        for (int i = 0; i < this.bucket.length; i++)
        {
            if (this.bucket[i].size() < min.size())
            {
                min = this.bucket[i];
            }
        }
        return min.size();
    }

    public int max()
    {
        ArrayList max = this.bucket[0];
        for (int i = 0; i < this.bucket.length; i++)
        {
            if (this.bucket[i].size() > max.size())
            {
                max = this.bucket[i];
            }
        }
        return max.size();
    }

    public int avg()
    {
        int sum = 0;
        for (int i = 0; i < this.bucket.length; i++)
        {
            sum += this.bucket[i].size();
        }
        return sum / this.bucket.length;
    }
}
