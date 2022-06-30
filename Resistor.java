public final class Resistor extends StockItem{

    float resistance; // in ohms

    //Constructor - is this the right way to do it?? - think this means it will just use the base class one
    public Resistor(String stockCode, int numInStock, float unitPrice, float resistance) {
        super(stockCode, numInStock, unitPrice);
        this.resistance = resistance;
    }
}
