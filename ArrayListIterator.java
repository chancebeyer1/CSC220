package csc220;

import java.util.Iterator;

//	an iterator over a my array list
public class ArrayListIterator<T> implements Iterator<T>
{
	private MyArrayList<T> theList;
	//	the current element
	private int current;

	public ArrayListIterator(MyArrayList<T> theList)
	{
		this.theList = theList;
		this.current = 0;
	}
	
	//	return true if there is another element
	@Override
	public boolean hasNext()
	{
		return this.current < this.theList.size();
	}

	//	return the next element
	@Override
	public T next()
	{
		T elt = this.theList.get(current);
		this.current++;
		return elt;
	}

}