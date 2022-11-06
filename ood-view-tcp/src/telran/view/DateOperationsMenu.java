package telran.view;

public class DateOperationsMenu {
	public static Menu getDateOperationsMenu() {
		Menu menu = new Menu("Arithmetic operations", getItems());
		menu.perform(new consoleInputOutput());
		return menu;
	}

	private static Item[] getItems() {
		Item[] res = { Item.of("Add numbers", DateOperationsMenu::add),
				Item.of("Subtract numbers", DateOperationsMenu::subtract),
				Item.of("Multiply numbers", DateOperationsMenu::multiply),
				Item.of("Didide numbers", DateOperationsMenu::divide), 
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