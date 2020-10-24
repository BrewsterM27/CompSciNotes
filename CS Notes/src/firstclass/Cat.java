package firstclass;

public class Cat
{
	//instance variables are declared (Type name)
	private String name;
	private int foodInBelly;
	public Cat(String name, int foodInBelly)
	{
		//instance variable = parameter
		//instance variables are assigned values (= is the assignment operator)
		this.name = name;
		this.foodInBelly = foodInBelly;
	}
	public void speak()
	{
		System.out.println("My name is " + name);
	}
	public void eat(int foodQty)
	{
		foodInBelly = foodInBelly + foodQty;
	}
	//Get methods
	public String getName()
	{
		return name;
	}
	public int getFoodInBelly()
	{
		return foodInBelly;
	}
}