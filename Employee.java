package Adminemployees;

import java.util.jar.Attributes.Name;

public class Employee{
    private int idNumber;
    private int age;
    private boolean gender;
    private int yearEmployed;
    private String name;

    public static void main(String[] args) {
        Employee Employee = new Employee();
Employee.idNumber = 4013717;
Employee.age = 19;
Employee.gender = true;
Employee.yearEmployed = 2023;
Employee. name = "MUGA EMMANUEL";
System.out.println(Employee.name + " " + "Employee.age");
    }
}