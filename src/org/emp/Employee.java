package org.emp;

public class Employee {
	
	private void empID() {		
System.out.println("Employee Details");
	}
	
	private void empID(int id) {		
		System.out.println("Emp id is:"  +id);
			}
			
	private void empID(long mumNum,String name) {		
		System.out.println("Employee Mobile number "  +mumNum);
		System.out.println("Employee Name:"  +name);
			}
			
	private void empID(String location,long mumNum) {		
		System.out.println("Employee location :" +location);
		
		System.out.println("Employee mobile number"+mumNum);
			}
			
	private void empID(String name,int id,long mumNum) {		
		System.out.println("Employee Name:"  +name);
		System.out.println("Emp id is:"  +id);
		System.out.println("Employee Mobile number "  +mumNum);
			}
			
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empID();
		e.empID(100);
		e.empID("Salem", 9944966482l);
		e.empID(100, "Mani");
		e.empID("Mani",100, 9944966482l);
		
	}

}
