package external;

public class Mammal extends Animal{
    public Mammal(){
        System.out.println("Mammal costructor triggered.");
    }
    public void getProperties(){
        super.getProperties();
        System.out.println("Gives birth to live children");
    }
}
