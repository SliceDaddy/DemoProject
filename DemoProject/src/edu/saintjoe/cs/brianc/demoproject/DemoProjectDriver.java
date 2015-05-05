package edu.saintjoe.cs.brianc.demoproject;

public class DemoProjectDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoProject petOne, petTwo, petThree;
		
		petOne = new DemoProject("Puffy", 15, 2);
		petTwo = new DemoProject("Sissy", 2, 1);
		petThree = new DemoProject("C", 8, 1);
		
		System.out.println("Data for pet one: " + petOne.toString());
		petOne.setAge(16);
		System.out.println("Data for pet one: " + petOne.toString());
	}

}
