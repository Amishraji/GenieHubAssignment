abstract class Animal{
    public abstract void reproduce();
}
class Sparrow extends Animal{
    @Override
    public void reproduce(){
        System.out.println("Sparrow reproduce by laying egg");
    }
}
class Dog extends Animal{
    @Override
    public void reproduce(){
        System.out.println("Dog reproduce by giving birth to puppy");
    }
}
class Shark extends Animal{
    @Override
    public void reproduce(){
        System.out.println("Shark reproduce by giving birth to baby shark");
    }
}
public class AbsDemo {
    public static void main(String[] args) {
        Animal s = new Sparrow();
        s.reproduce();
        
        Animal s2 = new Shark();
        s2.reproduce();
    }
}
