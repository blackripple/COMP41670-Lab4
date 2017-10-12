/*class that represents a person who can drink non alcoholic and alcoholic drinks
 * also contains main function */

package ie.ucd.people;

import ie.ucd.items.Drink;
import ie.ucd.items.Wine;
import ie.ucd.items.Food;
import ie.ucd.items.AlcoholicDrink;
import ie.ucd.people.Person;

public class Drinker extends Person{

	private int numberOfDrinks;

	public Drinker()	{
		super();
	}

	@Override
	public boolean drink(Drink drink) {
		if (drink instanceof AlcoholicDrink)	{
			numberOfDrinks += 1;
		}
		System.out.println("Drinker drinks " + drink.getName());
		return true;
	}
	
	@Override
	public boolean eat(Food food) {
		System.out.println("Drinker eats " + food.getName());
		return true;
	}
	
	public boolean isDrunk()	{
		
		if (numberOfDrinks >= (super.getWeight())/10)	{
			System.out.println("Drinker is drunk");
			return true;
		}
		else		{
			System.out.println("Drinker is not drunk (yet)");
			return false;
		}
	}

	public static void main (String args[])	{
		
		/* testing out the class methods */
		Drinker drinker = new Drinker();
		drinker.setWeight(70);	
		System.out.println(drinker.getWeight());
		
		drinker.isDrunk();
		
		for (int i = 0; i < 12; i++)	{
			drinker.drink(new Wine("chateu",10,10, null));
		}
		
		drinker.isDrunk();
		
		NotDrinker notdrinker = new NotDrinker();
		notdrinker.drink(new Wine("regards",10,10,null));
		notdrinker.drink(new Coke("coke",10));
		
	}

}
