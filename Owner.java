package naresh_it_Exam.Chaning_Owner;


public class Owner {
    private String name;
    private int age;

    public Owner(String name, int age) {
        if (age <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.age = age;
    }
}






















