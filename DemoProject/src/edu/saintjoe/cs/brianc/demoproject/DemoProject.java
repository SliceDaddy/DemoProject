package edu.saintjoe.cs.brianc.demoproject;

// Test to make sure I'm connected to github

public class DemoProject {

	// Class to keep track of my pets
	private String name;
	private int age;
	private int petClass; // 1 = dog 2= cat 3 = parakeet, etc.
	
	// Constructors
	public DemoProject(String petName, int petAge, int thisPetClass) {
		name = petName;
		age = petAge;
		petClass = thisPetClass;
	}
	
	public String toString() {
		return "Pet class: " + petClass + " is named " + name + "Age: " + age;
	}
	
	// Accessors
	public String getName() {
		return name;
	}
	
	// likewise for the other two
	
	// Mutators
	public void setName(String newName) {
		name = newName;
	}
	
	
	}
	

