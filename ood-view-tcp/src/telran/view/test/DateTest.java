package telran.view.test;

import java.time.LocalDate;
import java.time.Period;

import telran.view.InputOutput;
import telran.view.Item;
import telran.view.Menu;
import telran.view.consoleInputOutput;

public class DateTest {
	static LocalDate today = LocalDate.now();
	static String format = "d/M/y";

	public static void main(String[] args) {
		Menu menu = new Menu("Operations with dates", getItems());
		menu.perform(new consoleInputOutput());
	}

	private static Item[] getItems() {
		Item[] res = { Item.of("Date after given number days", DateTest::dateAfter),
				Item.of("Date before given number days", DateTest::dateBefore),
				Item.of("Number days between two dates", DateTest::daysBetween),
				Item.of("Age according to the birthdate", DateTest::age), 
				Item.exit() };
		return res;
	}

	static void dateAfter(InputOutput io) {
		io.writeLine(today.plusDays(io.readInt("enter amount of days", "no date")));
	}

	static void dateBefore(InputOutput io) {
		io.writeLine(today.minusDays(io.readInt("enter amount of days", "no date")));
	}

	static void daysBetween(InputOutput io) {
		LocalDate startDate = io.readDate("Enter start date " + format, "no date in format " + format, format);
		LocalDate endDate = io.readDate("Enter end date " + format, "no date in format " + format, format);
		io.writeLine(Math.abs(endDate.toEpochDay() - startDate.toEpochDay()));
	}

	static void age(InputOutput io) {
		LocalDate birthDate = io.readDate("Enter birthdate " + format, "no date in format " + format, format);
		Period period=Period.between(birthDate, today);	
		io.writeLine(period.getYears()+" years "+period.getMonths()+" month "+period.getDays()+" days");
	}
}
