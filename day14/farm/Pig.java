package farm;

public class Pig extends Animal {
    
    public Pig(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return "oinc";
    }    
}
