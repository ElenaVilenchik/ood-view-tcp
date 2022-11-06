package telran.view.test;

import java.util.function.Consumer;

import telran.view.DateOperationsMenu;
import telran.view.InputOutput;
import telran.view.Item;
import telran.view.Menu;
import telran.view.NumbersOperationsMenu;
import telran.view.consoleInputOutput;

public class SubMenuTest {

	public static void main(String[] args) {
		Menu menu = new Menu("Home work", getSubMenu());
		menu.perform(new consoleInputOutput());
	}

	private static Item[] getSubMenu() {

		Item[] res = { Item.of("Arithmetic operations", DateOperationsMenu.getDateOperationsMenu()),
				Item.of("Operations with dates",  NumbersOperationsMenu.getNumbersOperationsMenu()), 
				Item.exit() };
		return res;
	}

}
