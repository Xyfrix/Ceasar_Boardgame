package src;
import java.util.ArrayList;
import java.util.Random;

public class Ceasar {
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
    static Province[] Map = new Province[18];
    
    public static void main(String[] args) {
        initBoard();
    }

    public static void initBoard() {
        long seed = System.currentTimeMillis() / 1000;
        Random random = new Random(seed);
        //Bonus.values()[index] example for getting nth index
        for (int i = 0; i < 18; i++) {
            Map[i] = new Province(Province.Bonus.values()[random.nextInt(0,6)]);
            System.out.println(Map[i].getBonus());
        }
    }
}