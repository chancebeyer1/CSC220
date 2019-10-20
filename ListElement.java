package csc220;

public class ListElement<T>
{
    // every list element has a value attribute
    T value;
    // every list element object has a next pointer which points to
    // a List Element object
    ListElement<T> next;

    public ListElement(T value)
    {
        this.value = value;
        this.next = null;
    }
}
