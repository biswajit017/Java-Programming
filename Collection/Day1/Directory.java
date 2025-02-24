//package Assignments;
//
//import java.util.ArrayList;
//
//public class Directory
//{
//    private ArrayList<Employee> people = new ArrayList<>();
//
//    public void addEmployee(Employee emp)
//    {
//        people.add(emp);
//    }
//
//    public void displayEmployee()
//    {
//        for (Employee e1 : people)
//        {
//            System.out.println(e1);
//        }
//        System.out.println();
//    }
//
//    public void updateEmployee(int index,String  newPosition,double newSalary)
//    {
//        if (index >= 0 && index <people.size())
//        {
//            Employee emp = people.get( index);
//            emp.setPosition(newPosition);
//            emp.setSalary(newSalary);
//        }
//        else
//        {
//            System.out.println("Invalid Index!...");
//        }
//
//
//    }
//    public void deleteEmployee(int index)
//    {
//        if (index >= 0 && index < people.size())
//        {
//            people.remove(index);
//        } else
//        {
//            System.out.println("Invalid index!");
//        }
//    }
//}
