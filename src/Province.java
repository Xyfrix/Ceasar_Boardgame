package src;
import java.util.ArrayList;

public class Province {
    enum Bonus {
        Tactics,
        Wealth,
        Poison,
        Centurion,
        Might,
        Senate
    }

    private Bonus pBonus;
    private ArrayList<Border> borders = new ArrayList<Border>();

    public Province(Bonus bIn) {
        pBonus = bIn;
    }

    public void addBorder(Border borderIn) {
        borders.add(borderIn);
    }
}