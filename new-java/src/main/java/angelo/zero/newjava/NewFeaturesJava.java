package angelo.zero.newjava;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class NewFeaturesJava {

    static final String ANGELO = "angelo";
    static final String FERREIRA = "ferreira";
    static final String JAKE = "jake";

    public static void main(String[] args) {

        // Java 9 - Factory Method of(...) e o uso de var
        var listOfNames = List.of(ANGELO, FERREIRA);
        var setOfNames = Set.of(ANGELO);
        var mapsOfNames = Map.of("1", ANGELO, 2, FERREIRA);

        //Java 13 - Text Blocks
        var loremIpsum = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus sed enim 
                egestas orci euismod lacinia. Donec mollis turpis non justo dignissim, 
                ut porta est sodales. Cras cursus finibus iaculis. Morbi volutpat sit 
                amet tellus eget sollicitudin. Praesent augue massa, placerat.Ω
                """;

        // Java 14 - Switch Expressions
        var nome = "jake";
        switch (nome){
            case ANGELO -> System.out.println("O nome encontrado foi: " + ANGELO);
            case JAKE -> System.out.println("O nome encontrado foi: " + JAKE);
            default -> System.out.println("Nenhum nome encontrado");

        }

        System.out.println(listOfNames);
        System.out.println(setOfNames);
        System.out.println(mapsOfNames);
        System.out.println(loremIpsum);
    }
}
