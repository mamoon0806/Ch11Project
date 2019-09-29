//Qazi Ulhaq 9/27

package edu.seminolestate.manageparts;

public class PurchasedPart extends Part{
	private double purchasePrice; //what does this part cost to buy?
	private String vendor;  //who do we buy this part from?
	private double handlingCost; //shipping and handling costs when we buy it
	public static final String DEFAULT_VENDOR_NAME = "no vendor name";
	public static final double DEFAULT_PURCHASE_PRICE = 0;
	public static final double DEFAULT_HANDLING_COST = 0; 
	
	public PurchasedPart(int newID) {
		this(newID, DEFAULT_DESCRIPTION, DEFAULT_SELL_PRICE, DEFAULT_HANDLING_COST, DEFAULT_PURCHASE_PRICE, DEFAULT_VENDOR_NAME);
	}
	
	
	public PurchasedPart(int newID, double newHandlingCost, double newPurchPrice, String newVendor) {
		this(newID, DEFAULT_DESCRIPTION, DEFAULT_SELL_PRICE, newHandlingCost, newPurchPrice, newVendor);
	}
	
	
	public PurchasedPart(int newID, String newDesc, double newSellPrice, 
			double newHandlingCost, double newPurchPrice, String newVendor) {
		super(newID, newDesc, newSellPrice);
		setPurchasePrice(newPurchPrice);
		setHandlingCost(newHandlingCost);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public double getHandlingCost(){
		return handlingCost;
	}
	
	public double getPurchasePrice() {
		return purchasePrice;
	}
	
	public String getVendor() {
		return vendor;
	}
	
	public void setHandlingCost(double newHandlingCost) {
		if(newHandlingCost >= 0) {
			handlingCost = newHandlingCost;
		}
	}
	
	public void setPurchasePrice(double newPurchPrice) {
		if(newPurchPrice >= 0) {
			purchasePrice = newPurchPrice;
		}
	}
	
	public void setVendor(String newVendor) {
		if(newVendor != null && newVendor.length() > 0) {
			vendor = newVendor;
		}
	}
	
	@Override
	public double getTotalCost() {
		return super.getTotalCost() + handlingCost + purchasePrice;
	}

	
}
