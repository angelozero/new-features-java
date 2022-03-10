package angelo.zero.newjava;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class NewFeaturesJava {

    public static void main(String[] args) {

        var listOfNames = List.of("angelo", "ferreira");
        var setOfNames = Set.of("angelo");
        var mapsOfNames = Map.of("1", "angelo", 2, "ferreira");

        System.out.println(listOfNames);
        System.out.println(setOfNames);
        System.out.println(mapsOfNames);
    }
}
