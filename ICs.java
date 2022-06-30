public final class ICs extends StockItem{

    String description;

    public ICs(String stockCode, int numInStock, float unitPrice, String description) {
        super(stockCode, numInStock, unitPrice);
        this.description = description;
    }
}
