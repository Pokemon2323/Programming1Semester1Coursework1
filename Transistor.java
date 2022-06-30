public final class Transistor extends StockItem{

    public enum Type {NPN, PNP, FET} //check if I've done enums right here
    Type type;

    public Transistor(String stockCode, int numInStock, float unitPrice, Type type) {
        super(stockCode, numInStock, unitPrice);
        this.type = type;
    }
}
