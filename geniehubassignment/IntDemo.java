
interface AquaticAnimal{

   void swim();

}

interface TerrestrialAnimal{
    void moveonland();
}
class Snake implements AquaticAnimal,TerrestrialAnimal{
    public void swim(){
        System.out.println("Snake swims using its tail");
    }
    public void moveonland(){
        System.out.println("Snake Creeps on land");
    }
}
class Frog implements AquaticAnimal,TerrestrialAnimal{
    public void swim(){
        System.out.println("Frog swims using its feet");
    }
    public void moveonland(){
        System.out.println("Frog jumps on land");
    }
}
public class IntDemo {
    public static void main(String[] args) {
        Snake snake=new Snake();
        snake.swim();
        snake.moveonland();
        
        Frog frog = new Frog();
        frog.swim();
        frog.moveonland();
    }
}
