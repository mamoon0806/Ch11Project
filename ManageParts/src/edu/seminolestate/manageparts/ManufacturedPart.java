package edu.seminolestate.manageparts;
public class ManufacturedPart extends Part{

	private double laborCost;//cost to make part 
	private double materialCost;//amount of material in product
	public static final double DEFAULT_LABOR_COST = 0;
	public static final double DEFAULT_MATERIAL_COST = 0;
	
	public ManufacturedPart(int newID) {
		this(newID, DEFAULT_LABOR_COST, DEFAULT_MATERIAL_COST);
	}
	
	public ManufacturedPart(int newID, double newLaborCost, double newMaterialCost) {
		this(newID, DEFAULT_DESCRIPTION, DEFAULT_SELL_PRICE, newLaborCost, newMaterialCost);
	}
	
	public ManufacturedPart(int newID, String newDesc, double newSellPrice, double newLaborCost,
			double newMaterialCost) {
		super(newID, newDesc, newSellPrice);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public double getLaborCost() {
		return laborCost;
	}
	
	public double getMaterialCost() {
		return materialCost;
	}
	
	public void setLaborCost(double newLaborCost) {
		if(newLaborCost >= 0) {
			laborCost = newLaborCost;
		}
	}
	
	public void setMaterialCost(double newMaterialCost) {
		if(newMaterialCost >= 0) {
			materialCost = newMaterialCost;
		}
	}
	
	@Override
	public double getTotalCost() {
		return super.getTotalCost() + laborCost + materialCost;
	}
}


