package empWagePrblm;

public class EmpUC2 {
	static int wagePerHour=20;
	static int fullDayHour=8;
	public static void main(String[] args) {
		int dailyWage;
		int empCheck=(int) Math.floor(Math.random()*10)%2;
		System.out.println(empCheck);
		if (empCheck==0) {
			System.out.println("Employee is absent");
		}
		else {
			System.out.println("Employee is present");
			dailyWage=wagePerHour*fullDayHour;
			System.out.println("DAily wage= "+dailyWage);
		}
	}
}