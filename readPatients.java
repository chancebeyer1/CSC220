package csc220;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class readPatients
{

    public static Patient[] readPatients(String fileName) throws IOException
    {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String firstline = br.readLine();
        int firstnum = Integer.parseInt(firstline);
        Patient[] result = new Patient[firstnum];
        for (int i = 0; i < result.length; i++)
        {
            String line = br.readLine();
            if (line == null)
            {
                break;
            }

            String[] values = line.split(",");
            result[i] = new Patient(Integer.parseInt(values[0]), values[1], values[2], Double.parseDouble(values[3]));

        }
        return result;
    }

    public static void main(String[] args) throws IOException
    {
Patient[] p = readPatients("C:\\Users\\chanc\\OneDrive\\Desktop\\patient.txt");
System.out.println(p[2].address);
    }

}
