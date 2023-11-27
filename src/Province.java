package src;
import java.util.ArrayList;
import java.util.Random;

public class Province {
    enum pNames {
        Hispania_U,
        Hispania_C,
        Mauritania,
        Sardinia,
        Gallia,
        Numidia,
        Sicilia,
        Italia,
        Gallia_C,
        Africa,
        Achaia,
        Macedonia,
        Dalmatia,
        Cyrene,
        Creta,
        Aegyptus,
        Asia,
        Syria 
    }
    enum Bonus {
        Tactics,
        Wealth,
        Poison,
        Centurion,
        Might,
        Senate
    }
    private short control;
    private pNames name;
    private Bonus pBonus;
    private ArrayList<Border> borders = new ArrayList<Border>();

    public Province(Bonus bonus) {
        pBonus = bonus;
    }

    public void addBorder(Border borderIn) {
        borders.add(borderIn);
    }

    public Bonus getBonus() {
        return pBonus;
    }
}