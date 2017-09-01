public class WeightCalculator
{
	public static void main(String[] args)
	{
		double weight = Double.parseDouble(args[0]);
		
		double venus = weight * 0.91;
		double saturn = weight * 1.06;
		
		
		System.out.println("Venus: " + venus);
		System.out.println("Saturn: " + saturn);
		
		printPlanet(weight, 0.38, "Mars");
		printPlanet(weight, 2.36, "Jupiter");
	}
	
	public static void printPlanet(double earth, double factor, String planet)
	{
		double weight = earth * factor;
		System.out.println(planet + ": " + weight);
	}
	
}