/**
 * 
 * @author Trevor Little
 * @version 2/4/19
 * Text Files Lab
 * This is the InventoryItem class that defines what it means to be an InventoryItem, as well
 * as getters and setters for each variable 
 */


public class InventoryItem {
	private int sku;
	private String description;
	private double price;
	private int quantity;
	
	
	public InventoryItem(String description, int sku, double price, int quantity) {
		this.sku= sku;
		this.description= description;
		this.price= price;
		this.quantity= quantity;
	}


	public int getSku() {
		return sku;
	}


	public void setSku(int sku) {
		this.sku = sku;
	}


	public String getDescription() {
		return description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return description + "\n" + sku +  " " + price + " " + quantity + "\n";
		
		
	}
}
