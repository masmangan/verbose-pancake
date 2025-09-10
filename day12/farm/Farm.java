package farm;

public class Farm {

    public static void main(String[] args) {
        //Animal c1 = new Cow();
        //var  p1 = new Pig();
        //Chicken r1 = new Chicken();
        //Animal a1 = new Animal();

        //System.out.println(c1.talk());
        //System.out.println(p1.talk());
        //System.out.println(r1.talk());
        //System.out.println(a1.talk());

        Animal[] as = {new Cow(), new Pig(), new Chicken()};
        
        for (Animal a : as) {
            System.out.println(a.talk());    
        }

    }
    
}
