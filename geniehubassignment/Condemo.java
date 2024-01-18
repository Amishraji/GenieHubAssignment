class Student1{
    int id;
    String name;
    int age;
// Consturctor Overloading
    Student1() {
        id=102;
        name="Subhash";
        age=25;
    }
    
    Student1(int i, String n) {
        id = i;
        name = n;
    }
    //Parametrized constructor
    Student1(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    
    void display(){
        System.out.println(id + name + age);
    }   
}
class Condemo {
    public static void main(String[] args) {
        Student1 s= new Student1();
        Student1 s1= new Student1(102,"Mishra");
        Student1 s2= new Student1(104,"Ankush",25);
        Student1 s3= new Student1(102,"Mishr",24);
        
        s.display();
        s1.display();
        s2.display();
        s3.display();
    }
}
