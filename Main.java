import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		CaffeinatedBeverage[] inventory = new CaffeinatedBeverage[10];
		Scanner keyboard = new Scanner(System.in);
		// Prompt user with options in a loop
		int choice, ounces, brewTemp, count = 0;
		String name;
		double price;

		do {
			System.out.println("1) Enter new Tea");
			System.out.println("2) Enter new Yerba Mate");
			System.out.println("3) Exit");
			System.out.print(">>");
			choice = keyboard.nextInt();

			switch (choice) {
				case 1: // Tea
					System.out.print("Enter name      : ");
					name = keyboard.next();
					System.out.print("Enter ounces    : ");
					ounces = keyboard.nextInt();
					System.out.print("Enter price     $ ");
					price = keyboard.nextDouble();
					System.out.print("Enter brew temperature (in Celsius): ");
					brewTemp = keyboard.nextInt();

					// Create a Tea, put into array
					inventory[count] = new Tea(name, ounces, price, brewTemp);

					System.out.println("Your tea order has been added: " + inventory[count]);
					count++;
					break;

				case 2: // YerbaMate
					System.out.print("Enter name      : ");
					name = keyboard.next();
					System.out.print("Enter ounces    : ");
					ounces = keyboard.nextInt();
					System.out.print("Enter price     $ ");
					price = keyboard.nextDouble();
					System.out.print("Enter brew temperature (in Celsius): ");
					brewTemp = keyboard.nextInt();

					// Create a Tea, put into array
					inventory[count] = new YerbaMate(name, ounces, price, brewTemp, 0);

					System.out.println("Your YerbaMate order has been added: " + inventory[count]);
					count++;
					break;

			}

		} while (choice != 3);
		keyboard.close();

		if (count == 0)
		{
			return; // don't print anything if there are no beverages
		}
		for (int i = 0; i < count; i++) {
			System.out.println(inventory[i].toString());
		}

		System.out.println("Average price: " + findAveragePrice(inventory));
		System.out.println("Priciest Yerba Mate: " + findHighestPricedYerbaMate(inventory));
	}
	
	public static double findAveragePrice(CaffeinatedBeverage[] inventory) 
	{
		double sum = 0;
		int count = 0;

		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				count++;
				sum += inventory[i].getPrice();
			}
		}

		return sum / count;
	}
	
	public static YerbaMate findHighestPricedYerbaMate(CaffeinatedBeverage[] inventory)
	{
		YerbaMate highest = null;

		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null && inventory[i].getClass() == YerbaMate.class) {
				if (highest == null || inventory[i].getPrice() > highest.getPrice())
				{
					highest = (YerbaMate)inventory[i];
				}
			}
		}

		return highest;
	}
}