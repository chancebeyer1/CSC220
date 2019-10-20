package csc220;

import java.util.Iterator;

public class MyLinkedList<T> implements IList<T>, Iterable<T>
{

    // every LinkedList object has a head attribute
    private ListElement<T> head;
    private ListElement<T> last;
    private int len;

    public MyLinkedList()
    {
        this.head = null;
    }

    public ListElement<T> getHead()
    {
        return head;
    }

    public int size()
    {
//        ListElement current = this.head;
//        int count = 0;
//        while (current != null)
//        {
//            current = current.next;
//            count++;
//        }
//        return count;
        return this.len;
    }

    private void checkIndex(int i)
    {

        if (i < 0 || i >= this.size())
        {
            throw new IndexOutOfBoundsException(i);
        }
    }

    public boolean isEmpty()
    {
        return (this.head == null);
    }

    public void addFront(T newValue)
    {
        ListElement<T> newElement = new ListElement<>(newValue);
        if (this.isEmpty())
        {
            this.last = newElement;
            this.head = newElement;

        }
        else
        {

            newElement.next = this.head;
            this.head = newElement;
        }
        this.len++;
    }

    public void add(T newValue)
    {
        ListElement<T> newElement = new ListElement<>(newValue);
        if (this.isEmpty())
        {
            this.head = newElement;
            this.last = newElement;
        }
        else
        {
            this.last.next = newElement;
            this.last = newElement;
        }
        this.len++;
    }

    public T get(int i)
    {
        ListElement<T> current = hop(i);
        return current.value;
    }

    private ListElement<T> hop(int i)
    {
        ListElement<T> current = this.head;
        for (int j = 0; j < i; j++)
        {
            current = current.next;
        }
        return current;
    }

    public void delete(int i)
    {
        checkIndex(i);
        if (i == 0)
        {
            this.head = this.head.next;
            if (this.head == null)
            {
                this.last = null;
            }
        }
        else
        {
            ListElement<T> prev = hop(i - 1);
            prev.next = prev.next.next;
            if (prev.next == null)
            {
                this.last = null;
            }
        }

        this.len--;
//      ListElement<T> prev = null;
//        ListElement<T> current = this.head;
//        for (int j = 0; j < i; j++)
//        {
//            prev = current;
//            current = current.next;
//        }
//        prev.next = current.next;
//        this.len--;
    }

    public void addMiddle(T element, int i)
    {
        checkIndex(i);
        if (i == 0)
        {
            this.addFront(element);
        }
        else
        {
            ListElement<T> newElement = new ListElement<>(element);
            ListElement<T> prev = hop(i - 1);
            newElement.next = prev.next;
            prev.next = newElement;
            this.len++;
        }
//        if (i == 0)
//        {
//            this.addFront(element);
//        }
//        else
//        {
//            ListElement<T> newElement = new ListElement<>(element);
//            ListElement<T> prev = null;
//            ListElement<T> current = this.head;
//            for (int j = 0; j < i; j++)
//            {
//                prev = current;
//                current = current.next;
//            }
//            newElement.next = current;
//            prev.next = newElement;
//            if (i == len - 1)
//            {
//                this.last = newElement;
//            }
//            this.len++;
//        }
    }

    public void set(T Element, int i)
    {
        ListElement current = hop(i);
        current.value = Element;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        result.append("[");
        ListElement<T> current = this.head;
        while (current != this.last)
        {

            result.append(current.value);
            result.append(", ");
            current = current.next;
        }
        if (this.len != 0)
        {
            result.append(this.last);
        }
        result.append("]");

        return result.toString();
    }

    @Override
    public Iterator<T> iterator()
    {
        return new LinkedListIterator<>(this);
    }

}
