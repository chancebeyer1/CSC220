package csc220;

//  template for what a student is
public class Student
{
    //  not a variable declaration, its an attribute of a single student object
    //  every student object has a gpa
    String name;
    double gpa;
    int id;

    public Student(int id, String name)
    {
        this.name = name;
        this.id = id;
    }
    double owe;
    
    
    public Student(String name, double gpa, int id, double owe)
    {
        this.name = name;
        this.gpa = gpa;
        this.id = id;
        this.owe = owe;
    }
}
