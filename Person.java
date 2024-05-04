public class Person {
	//set attributes for Person class
	String name;
	int age;
	String companyName;
	
	// sets default variable for age, which then can be changed in Main.java
	public Person(){
		age = 60;
	}
	// constructor for Person, changing attributes
	Person(String pName, int pAge, String pCompanyName){
		name = pName;
		age = pAge;
		companyName = pCompanyName;
	}
	// method for printing out phrase relating to the class variables/attributes
	void company() {
		System.out.println(name + ", co-founder/founder of " + companyName);
	}
}