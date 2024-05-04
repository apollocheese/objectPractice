// 5/4/2024
public class Main {
	public static void main(String []args) {
		
		//creating 3 objects from the Person class and attributes in Person.java 
		Person bg = new Person();
		
		bg.name = "Bill Gates";
		bg.age = 68;
		bg.companyName = "Microsoft";
		
		Person sj = new Person();
		
		sj.name = "Steve Jobs";
		sj.age = 56;
		sj.companyName = "Apple";
		
		Person jb = new Person();
		
		jb.name = "Jeff Bezos";
		jb.age = 60;
		jb.companyName = "Amazon";
		
		bg.company();
		sj.company();
		jb.company();
		
		//creating a similar object, this time from the constructor I declared in Person.java
		Person mz = new Person("Mark Zuckerberg", 39, "Facebook and Meta");
		
		// printing out name attribute from the object "bg"
		System.out.println(bg.name);
		
		//executing the method company() made in Person.java using the bg object
		bg.company();
		
		//executing the method company() made in Person.java using the mz object
		mz.company();
		
	}
}