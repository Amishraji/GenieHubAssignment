
class Student2{
private String name;
private int age;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class GetDemo {
    public static void main(String[] args) {
        Student2 s1= new Student2();
        s1.setName("Ankush");
        s1.setAge(22);
        System.out.println(s1.getName() + s1.getAge());
    }
}
