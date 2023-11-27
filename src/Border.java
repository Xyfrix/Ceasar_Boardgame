package src;

public class Border {
    enum Type {
        Sword,
        Shield,
        Boat
    }

    private Type symbol;
    private Province pLeft;
    private Province pRight;

    public Border(Type Typein, Province lP, Province rP) {
        symbol = Typein;
        pLeft = lP;
        pRight = rP;
    }

    public Type getSymbol() {
        return symbol;
    }

    public static void main(String[] args) {
        Type t = Type.Shield;
        System.out.println(t.ordinal());
        System.out.println(Type.Boat);
    }
}