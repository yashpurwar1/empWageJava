package empWagePrblm;

public class EmpUC5 {
	static int wagePerHour = 20;
	static int partTimeHour = 4;
	static int fullDayHour = 8;

	public static void main(String[] args) {
		int dayWage = 0;
		int days;
		int totalWage=0;
		for (days=1; days<=20; days++) {
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch (empCheck) {
			case 0:
				System.out.println("Employee is absent");
				dayWage=0;
				break;
			case 1:
				System.out.println("Employee is present");
				dayWage=wagePerHour*fullDayHour;
				System.out.println("DAily wage= "+dayWage);
				break;
			case 2:
				System.out.println("Employee parttime present");
				dayWage=partTimeHour*wagePerHour;
				System.out.println("Parttime wage = "+dayWage);
				break;
			}
			totalWage=totalWage+dayWage;
		}
		System.out.println("Wage for the month is "+ totalWage);
	}
}
