
package exercises.E312;

public class Invoice {
    private String id;
    private String description;
    private int quantity;
    private double pricePerItem;

    public Invoice() {
    }

    public Invoice(String id, String description, int quantity, double pricePerItem) {
        this.id = id;
        this.description = description;
        if(quantity >= 0){
            this.quantity = quantity;
        }
        if(pricePerItem >= 0){
            this.pricePerItem = pricePerItem;
        }
    }
    
    public Invoice (int quantity, double pricePerItem){
        if(quantity >= 0){
            this.quantity = quantity;
        }
        if(pricePerItem >= 0){
            this.pricePerItem = pricePerItem;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    
    public double getInvoiceAmount (){
        return pricePerItem * quantity;
    }
    
}
