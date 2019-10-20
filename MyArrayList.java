package csc220;

import java.util.Iterator;

public class MyArrayList<T> implements IList<T>,Iterable<T>
{

    private static final int INITIAL_ARRAY_SIZE = 100;

    //  every MyArrayList object contains a counter and an array of numbers
    private int count;
    private T[] numbers;

    public MyArrayList(int initialSize)
    {
        this.count = 0;
        this.numbers = (T[]) new Object[initialSize];
    }

    //  initialize the empty array list
    public MyArrayList()
    {
        this(INITIAL_ARRAY_SIZE);
    }

    //  return a new bigger array with "a" copied into it, 
    //  and a zero at the top
    private void expandIfNeeded()
    {
        //  do we need to expand?
        if (this.count == this.numbers.length)
        {
            T[] B = (T[]) new Object[this.numbers.length + 10];
            for (int i = 0; i < this.numbers.length; i++)
            {
                B[i] = this.numbers[i];
            }

            this.numbers = B;
        }
    }

    //  add num to a by making a bigger array and adding the number to that
    public void add(T num)
    {
        expandIfNeeded();
        this.numbers[this.count] = num;
        this.count++;
    }

    public int size()
    {
        return this.count;
    }

    //  return the i-th element
    public T get(int i)
    {
        return this.numbers[i];
    }

    public void trim()
    {
        T[] result = (T[]) new Object[this.count];
        for (int i = 0; i < this.count; i++)
        {
            result[i] = this.numbers[i];
        }
        this.numbers = result;
    }

    //  deleting the i-th element
    public void delete(int i)
    {
        for (int x = i; x < this.count - 2; x++)
        {
            this.numbers[x] = this.numbers[x + 1];
        }
        //  this.nums[i] = 0;
        this.numbers[this.count - 1] = null;
        this.count--;
    }

    public void addFront(T d)
    {
        this.addMiddle(d, 0);
    }

    public void addMiddle(T d, int i)
    {
        this.expandIfNeeded();
        for (int j = this.count; j >= i; j--)
        {
            this.numbers[j + 1] = this.numbers[j];
        }

        this.numbers[i] = d;
        this.count++;
    }

    public String toString()
    {
        StringBuilder result = new StringBuilder(this.count);
        result.append("[");
        for (int i = 0; i < this.count; i++)
        {
            if (i != this.count - 1)
            {
                result.append(this.numbers[i]);
                result.append(", ");
            }
            else
            {
                result.append(this.numbers[i]);
            }
        }
        result.append("]");

        return result.toString();
    }

    @Override
    public Iterator<T> iterator()
    {
        return new ArrayListIterator<>(this);
    }

}
