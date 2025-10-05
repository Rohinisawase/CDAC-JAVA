
public class Date {

	public int day;
	public int month;
	public int year;

	private static final int[] DAYS_IN_MONTH = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// Constructors
	public Date(int day, int month, int year) {
		setDate(day, month, year);
	}

	public Date() {
		this(1, 1, 2025);
	}

	//Function to Accept Date
	public void acceptDate() {
		int day, month, year;

		System.out.println("Enter day:");
		day = ConsoleInput.getInteger();

		System.out.println("Enter month:");
		month = ConsoleInput.getInteger();

		System.out.println("Enter year:");
		year = ConsoleInput.getInteger();

		setDate(day, month, year);
	}

	//setter
	public void setDate(int day, int month, int year) {

		// Validate year
		if (year < 1900 || year > 2030) {
			this.year = 2025;
		} else {
			this.year = year;
		}

		// Validate month
		if (month < 1 || month > 12) {
			this.month = 1;
		} else {
			this.month = month;
		}

		// Validate day
		int[] daysInMonth = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (isLeap(this.year)) {
			daysInMonth[2] = 29;
		}

		if (day < 1 || day > daysInMonth[this.month - 1]) {
			this.day = 1;
		} else {
			this.day = day;
		}
	}

	// Function to addDays
	public void addDays(int daysToAdd) {
		while (daysToAdd > 0) {
			int daysInMonth = DAYS_IN_MONTH[month];
			if (month == 2 && isLeap(year))
				daysInMonth = 29;

			int remainingDays = daysInMonth - day;
			if (daysToAdd <= remainingDays) {
				day += daysToAdd;
				daysToAdd = 0;
			} else {
				daysToAdd -= (remainingDays + 1);
				day = 1;
				month++;
				if (month > 12) {
					month = 1;
					year++;
				}
			}
		}
	}

	// Function Add months (converts months to days)
	public void addMonths(int monthsToAdd) {
		int totalDays = 0;
		int tempMonth = month;
		int tempYear = year;

		for (int i = 0; i < monthsToAdd; i++) {
			int daysInMonth = DAYS_IN_MONTH[tempMonth];
			if (tempMonth == 2 && isLeap(tempYear))
				daysInMonth = 29;
			totalDays += daysInMonth;

			tempMonth++;
			if (tempMonth > 12) {
				tempMonth = 1;
				tempYear++;
			}
		}

		addDays(totalDays);
	}

	// Function Add years (converts years to months)
	public void addYears(int yearsToAdd) {
		addMonths(yearsToAdd * 12);
	}

	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public void displayDate() {
		System.out.println(day + "/" + month + "/" + year);
	}

	// Check Leap Year Or Not
	public boolean isLeap(int year) {

		boolean leap;

		if (year % 4 == 0 && year % 100 != 0)
			leap = true;
		else if (year % 400 == 0) {
			leap = true;
		} else {
			leap = false;
		}

		return leap;

	}

	// Comparing dates
	public void compareDate(int newDay, int newMonths, int newYears) {

		if (this.day == newDay && this.month == newMonths && this.year == newYears) {
			System.out.println("Dates matched");
		} else {
			System.out.println("Dates not matched");
		}
	}

}
