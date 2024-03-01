package org.billgeneration;

public class Main {
	public static void main(String[] args) {
		
		Biryani b=new Biryani(true);
		b.addExtraChickenPiece();
		b.addExtraRice();
		b.addExtraOnionRaitha();
		b.takeAway();
		b.getBill();
		
		
		
	}

}
