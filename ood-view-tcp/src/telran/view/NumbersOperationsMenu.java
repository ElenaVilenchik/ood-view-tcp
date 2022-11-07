package telran.view;

public class NumbersOperationsMenu {
	public static Item[] getNumbersOperationsMenu() {
		Item[] res = { Item.of("Add numbers", NumbersOperationsMenu::add),
				Item.of("Subtract numbers", NumbersOperationsMenu::subtract),
				Item.of("Multiply numbers", NumbersOperationsMenu::multiply),
				Item.of("Division numbers", NumbersOperationsMenu::divide), 
				Item.exit() };
		return res;
	}

	static void add(InputOutput io) {
		int numbers[] = enterNumbers(io);
		io.writeLine(numbers[0] + numbers[1]);
	}

	static void subtract(InputOutput io) {
		int numbers[] = enterNumbers(io);
		io.writeLine(numbers[0] - numbers[1]);
	}

	static void multiply(InputOutput io) {
		int numbers[] = enterNumbers(io);
		io.writeLine(numbers[0] * numbers[1]);
	}

	static void divide(InputOutput io) {
		int numbers[] = enterNumbers(io);
		io.writeLine(numbers[0] / numbers[1]);
	}

	private static int[] enterNumbers(InputOutput io) {
		int res[] = new int[2];
		res[0] = io.readInt("enter first number", "no number");
		res[1] = io.readInt("enter second number", "no number");
		return res;
	}
}