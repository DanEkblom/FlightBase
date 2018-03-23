package se.lexicon.model;

public class Menu {

	private FoodItem meal;
	private FoodItem beverage;
	
	public Menu(FoodItem meal, FoodItem beverage) {
		this.meal = meal;
		this.beverage = beverage;
	}
	
	/*
	 * Returns the cost of current meal and beverage 
	 */
	public int totalFoodCost(Menu menu) {
		return meal.getPrice() + beverage.getPrice();
	}
	
	public int getPrice() {
		return beverage.getPrice() + meal.getPrice();
	}
		
	/*
	 * Returns a menu with food-item names only for Business-passengers
	 */
	public String menuItems() {
		StringBuilder s = new StringBuilder();
		s.append("Beställd meny:\n• ");
		s.append(meal.getName());
		s.append("\n• ");
		s.append(beverage.getName());
		return s.toString();
	}

	/*
	 * Returns a menu with food-item names and prices for Economy-passengers 
	 */	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Beställd meny:\n• ");
		s.append(meal.toString());
		s.append("\n• ");
		s.append(beverage.toString());
		return s.toString();
	}
	
}
