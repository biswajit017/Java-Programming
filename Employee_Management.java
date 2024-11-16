
class Person {
    String name;
    int age;

 public Person(String name,int age){
    this.name = name;
    this.age= age;
 }
 public void displayInfo()
 {
    System.out.println("Name:" + name + " " +"  Age: " + age);
 }

}
class Employee extends Person{
    String EmpID;
public Employee(String name,int age,String EmpID)
{
    super(name,age);
    this.EmpID = EmpID;
}
public void displayEmployeeInfo(){
       displayInfo();
       System.out.println("EmpID:" + EmpID );
} 
}


class Manager extends Employee{
    String Department;
public Manager(String name,int age,String EmpID,String Department)
{
    super(name,age,EmpID);
    this.Department = Department;
}

public void displayManagerInfo()
{
    //displayInfo();
    displayEmployeeInfo();
    System.out.println("Department:" + Department );
} 
}

public class Employee_Management {
    public static void main(String[] args)
    {
        Manager m1 = new Manager("Kunu",22,"001","HR");
        m1.displayManagerInfo();
    }
}