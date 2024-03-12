import java.util.ArrayList;
import java.util.List;

public class StackingToy {

    private final List<String> stackedRings = new ArrayList<>();

    public void addRing(String ring) {
        stackedRings.add(ring);

        for (var addedRings : stackedRings) {
            System.out.println(addedRings);
        }
    }

    public void removeRing() {
        if (stackedRings.isEmpty()) {
            System.out.println("Stacked toy is empty.");
        }
        else {
            System.out.println("Removed ring: " + stackedRings.getLast());
            stackedRings.removeLast();
        }

        for (var addedRings : stackedRings) {
            System.out.println(addedRings);
        }
    }
}
