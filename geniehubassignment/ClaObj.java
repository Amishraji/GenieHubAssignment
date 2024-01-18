


class Student{
    int id;
    String name;

     void insert(int i,String n) {
        id=i;
        name=n;
    }
     void display(){
         System.out.println(id + name);
     }
    
}
public class ClaObj {
 public static void main(String[] args) {
     Student s1= new Student();
     Student s2= new Student();
     s1.insert(101, "Ankush");
     s2.insert(104, "Mishraji");
     s1.display();
     s2.display();
    }
}
