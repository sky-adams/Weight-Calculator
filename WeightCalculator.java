public class WeightCalculator
{
	public static void main(String[] args)
	{
		double weight = Double.parseDouble(args[0]);
		double mars = weight * 0.38;
		System.out.println("Mars: " + mars);
		System.out.println("Jupiter: " + weight * 2.36);
	}
}