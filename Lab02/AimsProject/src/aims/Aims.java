package aims;

public class Aims {

	public static void main(String[] args) {
		//Create a new cart
		Cart anOrder = new Cart();
		
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		
		anOrder.addDigitalVideoDisc(dvd1);
				

	}

}
