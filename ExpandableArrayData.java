package csc220;

public class ExpandableArrayData
{
	private static final int DEFAULT_INITIAL_SIZE = 10;
	
	//	each expandable array object contains an array of a numbers, and a count giving
	//	the number of numbers in the array that are actual numbers and not just zeros
	public double[] numbers;
	public int count;
	
	//	we construct every expandable array object so that it initially contains an empty array of numbers and 
	//	count of the number of numbers being zero
	public ExpandableArrayData(int initialSize)
	{
		this.numbers = new double[initialSize];
		this.count = 0;
	}
	
	public ExpandableArrayData()
	{
		this(DEFAULT_INITIAL_SIZE);
	}
}