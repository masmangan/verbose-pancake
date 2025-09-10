package farm;

public class Chicken extends Animal {

    public Chicken(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return "po po";
    }
    
}
