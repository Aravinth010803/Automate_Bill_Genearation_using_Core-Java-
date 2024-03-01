package org.billgeneration;

public class Biryani {
	
	private int price;
	private boolean veg;
	private int baseBiryaniPrice;
	
	private int extraRisePrice=100;
	private int extraOnionRaithaPrice=90; 
	private int extraChickenPiecePrice=150;
	private int backPackPrice=20;
	
	private boolean  isExtraRiceAdded=false;
	private boolean  isExtraOnionRaitha=false;
	private boolean  isExtraChickenpPiece=false;
	private boolean  isoptedForTakeAway=false;
	
	
    public Biryani(boolean veg) {
    	this.veg=veg;
    	if (this.veg) {
    		this.price=275;
		}else {
			this.price=350;
		}
    	baseBiryaniPrice= this.price;
	}
	
    public void addExtraRice() {
    	isExtraRiceAdded=true;
		this.price+=extraRisePrice;	
	}

   public void addExtraOnionRaitha() {
	   isExtraOnionRaitha=true;
		this.price=price+extraOnionRaithaPrice;
	}
  public void addExtraChickenPiece() {
	   isExtraChickenpPiece=true;
	   this.price=price+extraChickenPiecePrice;
}
    
   public void takeAway() {
	   isoptedForTakeAway=true;
		this.price=price+backPackPrice;
	}
  public void getBill() {
	  String bill="";
	    System.out.println("Biryani : "+baseBiryaniPrice);
	    if (isExtraRiceAdded) {
	           bill=bill+"Extra Rice added : "+extraRisePrice+"\n";
		}
	    if (isExtraOnionRaitha) {
			bill=bill+"Extra OnionRaitha added : "+extraOnionRaithaPrice+"\n";
		}
	    if (isExtraChickenpPiece) {
			bill=bill+"Extra Chicken addded : "+extraChickenPiecePrice+"\n";
		}
	    
	    if (isoptedForTakeAway) {
			bill =bill+"Take away : "+backPackPrice+"\n";
		}
	    bill +="Bill :"+this.price+"\n";
	    System.out.println(bill);
	    }
}
