package strings;

public class Vehicle {
	String name,model,price;
	Vehicle(String name,String model,String price)
	{
		this.name=name;
		this.model=model;
		this.price=price;
	}
	void getDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Model:"+model);
		System.out.println("Price:"+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle("Swift","VDI","450000");
		v1.getDetails();
		Vehicle v2=new Vehicle("Innova","Crysta","1200000");
		v2.getDetails();
	}

}
