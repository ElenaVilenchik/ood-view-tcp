package telran.view;

import java.time.LocalDate;
import java.time.Period;

public class DateOperationsMenu {
	static LocalDate today = LocalDate.now();
	static String format = "d/M/y";

	public static Item[] getDateOperationsMenu() {
		Item[] res = { Item.of("Date after given number days", DateOperationsMenu::dateAfter),
				Item.of("Date before given number days", DateOperationsMenu::dateBefore),
				Item.of("Number days between two dates", DateOperationsMenu::daysBetween),
				Item.of("Age according to the birthdate", DateOperationsMenu::age), 
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
		Period period = Period.between(birthDate, today);
		io.writeLine(period.getYears() + " years " + period.getMonths() + " month " + period.getDays() + " days");
	}
}
