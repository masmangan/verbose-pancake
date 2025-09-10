package farm;

public abstract class Animal implements Talkable, Comparable<Animal> {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String talk();

    @Override
    public String toString() {
        return super.toString() + " " + name;
    }

    @Override
    public int compareTo(Animal a) {
        return this.name.compareTo(a.name);
    }

}
