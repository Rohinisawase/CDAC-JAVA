
public class EntryDate {
	public static void main(String[] args) {

		Date objDate = new Date();
		int choice;
		do {

			System.out.println("1.Accept Date");
			System.out.println("2.Display Date");
			System.out.println("3.Add Days ");
			System.out.println("4.Add Months");
			System.out.println("5.Add Year");
			System.out.println("6.Compare Date");
			System.out.println("7.Exit");

			System.out.println("Enter choice:");
			choice = ConsoleInput.getInteger();

			switch (choice) {
			case 1: {
				System.out.println("Enter date:");
				objDate.acceptDate();
			}
				break;
			case 2: {
				System.out.println("Date is:");
				objDate.displayDate();
			}
				break;
			case 3: {
				System.out.println("Enter number of Days to add:");
				int days = ConsoleInput.getInteger();

				objDate.addDays(days);

				System.out.println("Changed Date:");
				objDate.displayDate();
			}
				break;
			case 4: {
				System.out.println("Enter number of Months to add:");
				int months = ConsoleInput.getInteger();

				objDate.addMonths(months);

				System.out.println("Changed date:");
				objDate.displayDate();
			}
				break;
			case 5: {
				System.out.println("Enter number of years to add:");
				int year = ConsoleInput.getInteger();

				objDate.addYears(year);

				System.out.println("Changed date:");
				objDate.displayDate();
			}
				break;

			case 6: {
				int day, month, year;
				System.out.println("Enter day:");
				day = ConsoleInput.getInteger();

				System.out.println("Enter month:");
				month = ConsoleInput.getInteger();

				System.out.println("Enter year:");
				year = ConsoleInput.getInteger();

				objDate.compareDate(day, month, year);
			}
			default: {
				System.out.println("Invalid Choice!");
			}
			}
		} while (choice != 7);

	}
}
