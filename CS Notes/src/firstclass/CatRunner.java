package firstclass;

public class CatRunner 
{
	public static void main(String[] args) 
	{
		//Type name = new Constructor();
		//Cat is a type
		//cat is the name of an object
		//new is a Java keyword
		//Cat() is a constructor
		//"Redford" is a String parameter
		Cat cat = new Cat("Redford", 0);
		//cat is an object
		//speak() is a method
		cat.speak();
		cat.eat(10);
		int food = cat.getFoodInBelly();
		String name = cat.getName();
		//+ is the concatenation operator
		System.out.println(name + " has " + food + " food in his belly.");
		
		Cat ben = new Cat("Ben", 50);
		ben.speak();
		ben.eat(20);
		ben.eat(30);
		String bensName = ben.getName();
		int bensFood = ben.getFoodInBelly();
		System.out.println(bensName + " has " + bensFood + " food in his belly.");		
	}
}
