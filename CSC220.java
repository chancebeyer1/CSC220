package csc220;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CSC220
{

	public static ExpandableArrayData readArray(String fileName) throws IOException
	{
		BufferedReader r = new BufferedReader(new FileReader(fileName));
		ExpandableArrayData a = new ExpandableArrayData();
		while (true)
		{
			String line = r.readLine();
			if (line == null)
			{
				break;
			}
			double n = Double.parseDouble(line);
			ExpandableArray.add(a, n);
		}

		return a;
	}

	public static IList random(int n)
	{
		IList result = new MyArrayList();
		for (int i = 0; i < n; i++)
		{
			result.add(Math.random());
		}

		return result;
	}

	public static <T extends Number> double sum(IList<T> L)
	{
		double result = 0;
		for (int i = 0; i < L.size(); i++)
		{
			T ith = L.get(i);
			result = result + ith.doubleValue();
		}

		return result;
	}

	public static <T extends Number> double sumJ(List<T> L)
	{
		double result = 0;
		Iterator<T> it = L.iterator();
		while (it.hasNext())
		{
			T elt = it.next();
			result = result + elt.doubleValue();
		}
//		for (T elt : L)
//		{
//			result = result + elt.doubleValue();
//		}

		return result;
	}

	public static void main(String[] args) throws IOException
	{
//		ExpandableArrayData a = new ExpandableArrayData();
//		ExpandableArray.add(a, 2);
//		ExpandableArray.add(a, 6);
//		ExpandableArray.add(a, 7);
//		ExpandableArray.add(a, 13);
//		ExpandableArray.add(a, 9);
//		System.out.println(Arrays.toString(a.numbers));
//
////		ExpandableArray.delete(a, 3);
////		System.out.println(Arrays.toString(a.numbers));
//		ExpandableArray.addMiddle(a, 7.4, 3);
//		System.out.println(ExpandableArray.toString(a));

		MyArrayList<Double> L = new MyArrayList<Double>();
		L.add(3.0);
		L.add(5.0);
		L.add(1.0);
		L.add(97.0);
		Iterator<Double> it = L.iterator();
		while (it.hasNext())
		{
			double d = it.next();
			System.out.println(d);
		}

		for (double d : L)
		{
			System.out.println(d);
		}

//		for (int i = 1; i <= 100000; i++)
//		{
//			L.add(i * 1.0);
//		}
//		try
//		{
//			double x = L.get(5000);
//		} catch (IndexOutOfBoundsException ex)
//		{
//			System.out.println("There was an error");
//		}
		IList X = random(10);

		//L.trim();
//		double s = sumJ(L);
//		System.out.println(s);
//		MyLinkedList l = new MyLinkedList();
//		for (int i = 0; i < 100; i++)
//		{
//			l.add(i);
//		}
//
//		l.addFront(12);
//		l.addFront(13);
//
//		double x = l.get(1);
//		System.out.println(x);
//
//		double xx = l.get(93);
//		System.out.println(xx);
//
//		System.out.println(l.size());
//		int N = 10_000_000;
//		ExpandableArrayData a = new ExpandableArrayData(N);
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < N; i++)
//		{
//			ExpandableArray.add(a, i);
//			a.count = 94;
//		}
//		long end = System.currentTimeMillis();
//		long timeTaken = end - start;
//		System.out.println(timeTaken);
////		assert a.length == N;
////		System.out.println(Arrays.toString(a.numbers));
//		System.out.println(a.numbers.length);
//		System.out.println(a.count);
//		double[] x = readArray("/home/graham/Desktop/nums.txt");
//		System.out.println(Arrays.toString(x));
//		Student s = new Student(1, "Bill");
//		System.out.println(s.owe);
//		s.increaseDebt(24);
//		//increaseDebt(s, 24);
//		System.out.println(s.owe);
//		Student [] a = new Student[4];
//		
//		for(int i = 0; i < 3; i++)
//		{
//			a[i] = new Student(i, "Bill" + i);
//		}
//		a[3]= a[0];
//		
//		System.out.println(a[3].id);
//		a[0].id = 54;
//		System.out.println(a[3].id);
//			
//		Student s = new Student(1, "Bill");
//		System.out.println(s.id);
//		System.out.println(s);
//
//		Student x = s;
//		System.out.println(x);
//		System.out.println(x.id);
//
//		s.id = 99;
//
//		System.out.println(x.id);
//		
//		Student t = new Student(2, "Jane");
//		System.out.println(t.id);
//		System.out.println(t.name);
//		int a = 1;
//		int b = a;
//		System.out.println(b);
//		a = 100;
//		System.out.println(b);
//		
//		int[] x = new int[4];
//		x[1] = 12;
//		int[] y = x;
//		System.out.println(Arrays.toString(y));
//		x[3] = 9;
//		System.out.println(Arrays.toString(y));
	}

	//	this method/function isn't correct of course
	public static int sum(int[] a)
	{
		return 0;
	}

	public static void increaseDebt(Student student, double increase)
	{
		student.owe += increase;
	}

}