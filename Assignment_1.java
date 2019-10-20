package csc220;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Assignment_1
{

    public static double sum(double[] a)
    {
        double sum = 0;
        for (double num : a)
        {
            sum = sum + num;
        }
        return sum;
    }

    public static double[] fill(int n, double v)
    {
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = v;
        }
        return a;
    }

    public static double[] random(int n)
    {
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = Math.random();
        }
        return a;
    }

    public static double min(double[] a)
    {
        double min = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }

    public static double max(double[] a)
    {
        double max = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    public static double average(double[] a)
    {
        return sum(a) / a.length;
    }

    public static double variance(double[] a)
    {
        double Var1 = 0;
        for (double num : a)
        {
            double x = (num - average(a));
            Var1 = Var1 + (x * x);
        }
        double Var = Var1 / a.length;
        return Var;
    }

    public static double stdDev(double[] a)
    {
        return Math.sqrt(variance(a));
    }

    public static double[] readCSVFile(String fileName) throws IOException
    {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String firstline = br.readLine();
        int firstnum = Integer.parseInt(firstline);
        double[] result = new double[firstnum];
        for(int i = 1; i <= result.length; i++)
        {
            String line = br.readLine();
            if (line == null)
            {
                break;
            }
            
                double num = Double.parseDouble(line);
                result[i-1] = num;

        }
        return result;
    }

    public static void print(double[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (i == a.length - 1)
            {
                System.out.println(a[i]);
            }
            else
            {
                System.out.print(a[i] + ", ");
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        double[] a =
        {
            1, 4, 2, 4, 8, 2, 3, 5
        };

        double sum = sum(a);
        System.out.println(sum);

        double[] fill = fill(4, 5);
        System.out.println(Arrays.toString(fill));
        
        double[] rand = random(5);
        System.out.println(Arrays.toString(rand));
        
        double min = min(a);
        System.out.println(min);
        
        double max = max(a);
        System.out.println(max);
        
        double avg = average(a);
        System.out.println(avg);
        
        double var = variance(a);
        System.out.println(var);
        
        double stdDev = stdDev(a);
        System.out.println(stdDev);
        
        double[] numsFile = readCSVFile("C:/Users/chanc/OneDrive/Desktop/nums.txt");
        System.out.println(Arrays.toString(numsFile));
        
        print(a);
    }

}
