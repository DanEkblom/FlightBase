package se.lexicon.model;

public class FoodItem {

	private String name;
	private int price;

	public FoodItem(String name, int price) {
		this.name = name;
		this.price = price;
	}//Food

	public static FoodItem chicken = new FoodItem("Kycklingcurry med ris", 89);
	public static FoodItem meatballs = new FoodItem("Svenska köttbullar med makaroner", 79);
	public static FoodItem bolognese = new FoodItem("Spaghetti bolognese med riven ost", 89);

	public static FoodItem lobster = new FoodItem("Handfångad skärgårdshummer, knappt död", 599);
	public static FoodItem escargo = new FoodItem("Handplockad escargot", 499);
	public static FoodItem frogLegs = new FoodItem("Ekologiska halstrade grodlår", 649);

	public static FoodItem wine = new FoodItem("Vida Vingars speciellt utvalda Fairtrade-KRAV-ekologiska hemtrampade rödvin", 109);
	public static FoodItem beer = new FoodItem("Öl från pilotens privata mikrobryggeri", 89);
	public static FoodItem water = new FoodItem("Kranvatten i en jättesnygg PET-flaska", 29);
	public static FoodItem lemonade = new FoodItem("Vår unika lemonad med endast de mest nödvändiga syntetiska färgämnena", 39);
	public static FoodItem coffee = new FoodItem("Vida Vingars speciellt utvalda Fairtrade-KRAV-ekologiska hemrostade kaffe", 39);
	public static FoodItem tea = new FoodItem("Vida Vingars speciellt utvalda Fairtrade-KRAV-ekologiska chai-te", 39);

	public static FoodItem champagne = new FoodItem("Champagne", 0);

	public static FoodItem redLabel = new FoodItem("Red Label", 119);
	public static FoodItem bruichladdich = new FoodItem("Bruichladdich", 229);

	public String toString() {
		return this.name + ", " + price + "kr.";
	}
	
	//TODO
	/* 
	 * Returns the price of foodItem
	 */
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}

}
