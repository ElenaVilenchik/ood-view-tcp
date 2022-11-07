package telran.view.test;

import telran.view.NumbersOperationsMenu;
import telran.view.Item;
import telran.view.Menu;
import telran.view.DateOperationsMenu;
import telran.view.consoleInputOutput;

public class MenuTest {

	public static void main(String[] args) {
		Menu menu = new Menu("Home work",
				new Menu("Arithmetic operations", NumbersOperationsMenu.getNumbersOperationsMenu()),
				new Menu("Operations with dates", DateOperationsMenu.getDateOperationsMenu()), 
				Item.exit());
		menu.perform(new consoleInputOutput());
	}

}
