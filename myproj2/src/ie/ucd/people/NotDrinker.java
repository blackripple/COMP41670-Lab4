/*class that represents a person who can drink non alcoholic but not any alcoholic drinks*/

package ie.ucd.people;

import ie.ucd.items.Drink;
import ie.ucd.items.Food;
import ie.ucd.people.Person;
import ie.ucd.items.AlcoholicDrink;

public class NotDrinker extends Person{

	/* drink method */
	@Override
	public boolean drink(Drink drink) {
		if (drink instanceof AlcoholicDrink)	{
			System.out.println("This person cannot drink a sweet alcoholic beverage");
			return false;
	}
		
		else		{
			System.out.println("This person has just drunk " + drink.getName());
			return true;
		}
	}

	@Override
	public boolean eat(Food food) {
		return true;
	}

}
