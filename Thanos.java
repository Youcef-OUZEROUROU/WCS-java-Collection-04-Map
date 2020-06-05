import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Thanos {

    public static void main(final String[] args) {

        final Hero hulk = new Hero("Hulk", 49);
        final Hero blackWidow = new Hero("Black Widow", 34);
        final Hero captainAmerica = new Hero("Captain America", 100);
        final Hero thor = new Hero("Thor", 1501);
        final Hero vision = new Hero("Vision", 3);
        final Hero scarletWitch = new Hero("Scarlet Witch", 29);
        final Hero doctorStrange = new Hero("Doctor Strange", 42);

        final Flower lily = new Flower("Lily");
        final Flower tulip = new Flower("Tulip");
        final Flower begonia = new Flower("Begonia");
        final Flower violet = new Flower("Violet");
        final Flower rose = new Flower("Rose");

        
        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet
        Comparator<Hero> comparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero orig, Hero compare) {
                return orig.getName().compareTo(compare.getName());
            }
        };
        Map<Hero, Flower> party = new TreeMap<>(comparator);
        party.put(hulk, rose);
        party.put(thor, rose);
        party.put(scarletWitch, rose);
        party.put(vision, tulip);
        party.put(captainAmerica, lily);
        party.put(doctorStrange, violet);
        party.put(blackWidow, violet);
        

        
        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println("party contains value `begonia`: " + party.containsValue(begonia));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for (Hero heros : party.keySet()) {
            Flower flower = party.get(heros);
            System.out.println( flower.getName());
        }

    }
}
