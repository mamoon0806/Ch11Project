//Qazi Ulhaq 9/27

package edu.seminolestate.manageparts;

public class Part {
	private int partID;
	private String partDescription;
	private double partSellPrice;
	public static final String DEFAULT_DESCRIPTION = "no part description";
	public static final double DEFAULT_SELL_PRICE = 0;
	
	public Part(int ID, String desc, double newSellPrice) {
		setPartID(ID);
		setPartDescription(desc);
		setPartSellPrice(newSellPrice);
	}
	
	public Part(int ID) {
		this(ID, DEFAULT_DESCRIPTION, DEFAULT_SELL_PRICE);
	}
	
	@Override
	public String toString() {	
		return this.getClass() + " ID: " + partID + " Part Desc: " + partDescription + " Part Sell Price: " + partSellPrice;
	}
	
	public int getPartID() {
		return partID;
	}
	
	public double getPartSellPrice() {
		return partSellPrice;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartID(int newID) {
		if(partID >= 0) {
			partID = newID;
		}
	}
	
	public void setPartDescription(String newDesc) {
		if(newDesc != null && newDesc.length() > 0) {
			partDescription = newDesc;
		}
	}
	
	public void setPartSellPrice(double newSellPrice) {
		if(newSellPrice >= 0) {
			partSellPrice = newSellPrice;
		}
	}
	
	public double getTotalCost(){
		return 0;
	}
}
