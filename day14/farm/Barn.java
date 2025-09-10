package farm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Barn implements Iterable<Talkable>{

    private List<Talkable> ts;

    public Barn() {
        ts = new ArrayList<>();
    }

    public void add(Talkable t) {
        ts.add(t);
    }

    @Override
    public Iterator<Talkable> iterator() {
        return ts.iterator();
       }
}
