package csc220;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T>
{

    MyLinkedList<T> theList;
    ListElement<T> current;

    public LinkedListIterator(MyLinkedList<T> theList)
    {
        current = theList.getHead();
    }

    @Override
    public boolean hasNext()
    {
        return current != null;
    }

    @Override
    public T next()
    {
        T elt = current.value;
        current = current.next;
        return elt;
    }

}
