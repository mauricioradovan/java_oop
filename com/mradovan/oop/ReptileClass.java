package external;

public class Reptile extends Animal{
    public Reptile(){
        System.out.println("Reptile constructor triggered.");
    }
    public void getProperties(){
        super.getProperties();
        System.out.println("Has cold blood.");
    }
}
