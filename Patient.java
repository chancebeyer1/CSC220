package csc220;

public class Patient
{

    int id;
    String name;
    String address;
    double height;

    public Patient(int id, String name, String address, double height)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.height = height;
    }

    public boolean isTall()
    {
        return this.height > 6.3;
    }
}
