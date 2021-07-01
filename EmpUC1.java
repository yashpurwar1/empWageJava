package empWagePrblm;

public class EmpUC1 {
	public static void main(String[] args) {
		int empCheck=(int) Math.floor(Math.random()*10)%2;
		System.out.println(empCheck);
		if (empCheck==0) {
			System.out.println("Employee is absent");
		}
		else {
			System.out.println("Employee is present");
		}
	}

}