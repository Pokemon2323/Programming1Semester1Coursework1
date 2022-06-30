//description here -> parent class for the item subclasses

public class StockItem {

    //String type; //might not need if making subclasses, also might want to be enum
    String stockCode; //might not want to be string, is there an alphanum kinda type??
    int numInStock;
    float unitPrice; //double or float? And why? In pence
    //Subclasses may also add extra info

    //Constructor - overridden by all except Diode?
    public StockItem( String stockCode, int numInStock, float unitPrice) {
        this.stockCode = stockCode;
        this.numInStock = numInStock;
        this.unitPrice = unitPrice;
    }

    //Accessor Methods - used by all?
    public String getStockCode() {
        return stockCode;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    /*
    Also need methods to
        - Sort by price (low to high)
        - Find component with largest num of components in stock
        - Total NPN transistors in stock
        - Total resistance of all resistors in stock
        - Amount of stock items with unit prices above 10p
    */
}
