public final class Capacitor extends StockItem{

    float capacitance; // in farads

    public Capacitor(String stockCode, int numInStock, float unitPrice, float capacitance) {
        super(stockCode, numInStock, unitPrice);
        this.capacitance = capacitance;
    }
}
