public class Employeeuc2  {

	public static void main(String[] args)  {
	//constant
	int IS_PRESENT = 1;
	int SALARY_PER_HOUR = 20;
	//variable
	double empcheck = Math.floor(Math.random() * 10) % 2;
	int workingHour = 0;
	if (empcheck == IS_PRESENT) {
	workingHour=8;
	System.out.println("employee is present");
       } else {
 	System.out.println("employee is absent");
      }
    }
}
