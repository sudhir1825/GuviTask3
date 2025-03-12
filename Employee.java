package Task3;

public class Employee implements Taxable {//class uses properties of interface Taxable
	//properties of Employee class
	long empId ;
	String name;
	double salary;
	
	
	@Override
	public float calcTax(double n) {//method to calculate income tax
		float ans = incometax/100 * (float) n;
		return ans;
	}
	
}

class Product implements Taxable{//class uses properties of interface Taxable
	//properties of Product class
	long empId ;
	double price;
	int quantity;
	
	public float calcTax(double n) {//method to calculate sales tax
		float ans = salestax/100 * (float)n;
		return ans;
	}
}
