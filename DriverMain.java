package Task3;
import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {//Main method to process 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		Employee obj = new Employee();//object create for Employee class
		Product obj1 = new Product();////object create for Product class
		
		System.out.print("Enter the Employee Id: ");//to get user input (eid,name,salary)
		long id = sc.nextLong();
		System.out.print("Enter Employee name: ");
		String name = sc.next();
		System.out.print("Enter Employee salary: ");
		double salary = sc.nextDouble();
		
		System.out.print("Enter the Product Id : ");//to get product details from user(pid,price,quantity)
		long pid = sc.nextLong();
		System.out.print("Enter Product Price: ");
		double price = sc.nextDouble();
		System.out.print("Enter Quantity: ");
		int quantity = sc.nextInt();
		
		float empTax = obj.calcTax(salary);//method call to calculate salary tax of an employee
		float productTax = obj1.calcTax(price*quantity);//method call to calculate product tax  
														//with respect to the quantity
		
		System.out.println("Tax to be paid for Employee Id "+id+" is :" +empTax);
		System.out.println("Tax to be paid for Product Id " +pid+" is :"+productTax);
	}

}
