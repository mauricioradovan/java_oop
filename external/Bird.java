package external;

public class Bird extends Animal{
    public Bird(){
        System.out.println("Bird costructor triggered.");
    }
    public void getProperties(){
        super.getProperties();
        System.out.println("Lays eggs");
    }
}
