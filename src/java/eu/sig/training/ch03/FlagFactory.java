package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {
    private Map<Nationality,List<Color>> flagColors = new HashMap<>();

    public FlagFactory() {
        this.flagColors.put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        this.flagColors.put(Nationality.GERMAN,Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        this.flagColors.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        this.flagColors.put(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        this.flagColors.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        this.flagColors.put(Nationality.ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        this.flagColors.put(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        this.flagColors.put(Nationality.HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        this.flagColors.put(Nationality.BULGARIAN,  Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        this.flagColors.put(Nationality.RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
        this.flagColors.put(Nationality.LUXEMBOURGER, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        this.flagColors.put(Nationality.UNCLASSIFIED, Arrays.asList(Color.GRAY));
    }

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        if (nationality == null) {
            return flagColors.get(Nationality.UNCLASSIFIED);
        }
        return flagColors.get(nationality);
    }
    // end::getFlag[]

}