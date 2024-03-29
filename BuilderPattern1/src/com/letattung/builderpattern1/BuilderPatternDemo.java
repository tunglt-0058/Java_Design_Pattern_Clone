// hoc theo java design pattern tutorial
package com.letattung.builderpattern1;

public class BuilderPatternDemo {

	public static void main(String [] args){
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg meal: ");
		vegMeal.showItems();
		System.out.println("Total price: " +vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon Veg meal: ");
		nonVegMeal.showItems();
		System.out.println("Total price: " +nonVegMeal.getCost());
	}
}
