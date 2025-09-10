package farm;

import java.util.Arrays;

public class Farm {

    public static void main(String[] args) {

        Barn b = new Barn();
        b.add(new Cow("Dorothy"));
        b.add(new Pig("Alex"));
        b.add(new Chicken("Nugget"));
        b.add(new Radio());

        for (Talkable t : b) {
            System.out.println(t.talk());    
        }

        Animal[] as = {
        new Cow("Dorothy"),
        new Pig("Alex"),
        new Chicken("Nugget"),
        };

        Arrays.sort(as);
        System.out.println(Arrays.toString(as));


    }
    
}
