
package csc220;

//  for an object to be an IList it must provide a sze and get
//  method that look as below
public interface IList<T>
{
//    int size();
//    boolean isEmpty();
    T get(int i);
    void add(T d);
    void addFront(T d);
    int size();
}
