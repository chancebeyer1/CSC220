package csc220;

import java.util.ArrayList;

public class MyStack<T>
{

    ArrayList<T> elements;
    public MyStack()
    {
        this.elements = new ArrayList<>();
    }
    
    public void push(T elt)
    {
        this.elements.add(elt);
    }
    
    public T pop()
    {
        return this.elements.remove(this.elements.size() - 1);
    }

}
